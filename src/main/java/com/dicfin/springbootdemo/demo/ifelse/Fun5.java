package com.dicfin.springbootdemo.demo.ifelse;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedAbstractActor;
import akka.japi.Creator;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.ibatis.javassist.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * 类描述: Actor模型+领域驱动设计+策略模式+事件响应式架构+动态类模板构建+运行时编译
 *
 * @author Wang Jinglei
 * @date 2022/1/7 4:25 下午
 * @modifier Wang Jinglei
 * @date 2022/1/7 4:25 下午
 * @Version V1.0
 */
public class Fun5 {
    private static String MAN = "man";
    private static String WOMAN = "woman";
    private static String WC_EVENT = "想上厕所";
    private static String WC_OVER_EVENT = "上完厕所了";

    private static ActorSystem actorSystem = ActorSystem.create();

    /**
     * 创建一个动态类，并实例化为对象，该方法会根据参数动态构建Class
     * @param name 动态类名
     * @param function actor模型消息处理方法 两个参数 一个是自身，一个是消息
     * @param attrAndValues 动态类的 属性 和 属性值
     * @return actor引用
     * @throws Exception
     */
    public static ActorRef createDynamicClassImpl(String name, BiConsumer function, Pair<String, String>... attrAndValues) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        // 动态定义包名 瞎几把写就行
        String className = "com.qmai.openapi.center." + name;
        // 创建一个空类
        CtClass cc = pool.makeClass(className);
        // 动态继承抽象类UntypedAbstractActor
        cc.setSuperclass(pool.get(UntypedAbstractActor.class.getName()));
        // 动态根据参数创建类的属性
        for (Pair<String, String> attrValue : attrAndValues) {
            CtField param = new CtField(pool.get(String.class.getName()), attrValue.getLeft(), cc);
            param.setModifiers(Modifier.PUBLIC);
            cc.addField(param, CtField.Initializer.constant(attrValue.getRight()));
        }
        // 创建类一个属性叫function类型是BiConsumer
        CtField param = new CtField(pool.get(BiConsumer.class.getName()), "function", cc);
        // 访问级别是PRIVATE
        param.setModifiers(Modifier.PRIVATE);
        cc.addField(param);
        // 创建模版方法 方法是执行BiConsumer对应的lambda表达式
        CtMethod m = CtNewMethod.make("public void onReceive(Object message) { function.accept($0, message);}", cc);
        cc.addMethod(m);
        // 动态添加构造方法
        CtConstructor cons = new CtConstructor(new CtClass[]{pool.get(BiConsumer.class.getName())}, cc);
        // 构造函数内容就是给function参数赋值、
        cons.setBody("{$0.function = $1 ;}");
        cc.addConstructor(cons);
        // 动态Actor类构建完毕
        Props p = Props.create(new Creator<UntypedAbstractActor>() {
            @Override
            public UntypedAbstractActor create() throws Exception {
                // 反射创建对象
                return (UntypedAbstractActor) cc.toClass().getConstructor(BiConsumer.class).newInstance(function);
            }
        });
        return actorSystem.actorOf(p);
    }

    public static void main(String[] args) throws Exception {
        ActorRef car = createDynamicClassImpl("car", (self, message) -> {
            System.out.println(message);
            System.out.println("开车走咯～～");
        });
        ActorRef toilet = createDynamicClassImpl("Toilet", (self, message)-> {
            try {
                Map<String, Consumer<String>> FUNC_MAP = new ConcurrentHashMap<>();
                FUNC_MAP.put(MAN, person-> System.out.println(person + "应该去男厕所"));
                FUNC_MAP.put(WOMAN, person-> System.out.println(person + "应该去女厕所"));
                // 因为是无类型，取值使用反射
                String gender = message.getClass().getField("gender").get(message).toString();
                String name = message.getClass().getField("name").get(message).toString();
                FUNC_MAP.get(gender).accept(name);
                car.tell(name + WC_OVER_EVENT, ActorRef.noSender());
            } catch (Exception e) {
                System.out.println("厕所不太欢迎这位");
            }
        });

        // 创建一个Person类，具有两个属性name和gender，并实例化，定义他的消息处理方法（或者叫领域驱动时间也可以）
        ActorRef person = createDynamicClassImpl("Person", (self, message) -> {
            Pair<String, ActorRef> pair = (Pair<String, ActorRef>) message;
            System.out.println(pair.getLeft());
            pair.getRight().tell(self, ActorRef.noSender());
        }, Pair.of("name", "张三"), Pair.of("gender", MAN));
        // 告诉张三想上厕所 让他找厕所去
        person.tell(Pair.of(WC_EVENT, toilet), ActorRef.noSender());
    }
}
