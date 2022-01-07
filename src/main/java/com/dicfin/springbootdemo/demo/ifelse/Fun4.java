package com.dicfin.springbootdemo.demo.ifelse;

import akka.actor.*;
import akka.japi.Creator;
import lombok.Data;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * 类描述: Actor模型+领域驱动设计+策略模式+事件响应式架构
 *
 * @author Wang Jinglei
 * @date 2022/1/7 3:55 下午
 * @modifier Wang Jinglei
 * @date 2022/1/7 3:55 下午
 * @Version V1.0
 */
public class Fun4 {
    private static String MAN = "man";
    private static String WOMAN = "woman";
    private static String WC_EVENT = "想上厕所";
    @Data
    static class Person extends UntypedAbstractActor {

        private String gender;
        private String name;

        public static Props props(final String name, final String gender) {
            return Props.create(new Creator<Person>() {
                private static final long serialVersionUID = 1L;
                @Override
                public Person create() throws Exception {
                    Person person = new Person();
                    person.setGender(gender);
                    person.setName(name);
                    return person;
                }
            });
        }
        @Override
        public void onReceive(Object message) throws Throwable {
            Pair<String, ActorRef> m = (Pair<String, ActorRef>) message;
            System.out.println(name + m.getLeft());
            m.getRight().tell(this, ActorRef.noSender());
        }
    }

    @Data
    static class Toilet extends UntypedAbstractActor {

        private static Map<String, Consumer<String>> FUNC_MAP = new ConcurrentHashMap<>();
        static {
            FUNC_MAP.put(MAN, person-> System.out.println(person + "应该去男厕所！"));
            FUNC_MAP.put(WOMAN, person-> System.out.println(person + "应该去女厕所！"));
        }
        public void wc(Person p) {
            FUNC_MAP.get(p.getGender()).accept(p.getName());
        }

        public static Props props() {
            return Props.create(Toilet.class);
        }
        @Override
        public void onReceive(Object message) throws Throwable {
            Person p = (Person) message;
            wc(p);
        }
    }

    public static void main(String[] args) {
        ActorSystem actorSystem = ActorSystem.create();
        ActorRef person = actorSystem.actorOf(Person.props("张三", MAN), "Zhangsan");
        ActorRef toilet = actorSystem.actorOf(Toilet.props(), "Toilet");
        Pair<String, ActorRef> message = Pair.of(WC_EVENT, toilet);
        person.tell(message, ActorRef.noSender());
    }
}
