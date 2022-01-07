package com.dicfin.springbootdemo.demo.ifelse;

import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * 类描述: DDD领域驱动设计思想+策略模式写法
 *
 * @author Wang Jinglei
 * @date 2022/1/7 3:41 下午
 * @modifier Wang Jinglei
 * @date 2022/1/7 3:41 下午
 * @Version V1.0
 */
public class Fun3 {
    private static String MAN = "man";
    private static String WOMAN = "woman";
    @Data
    static class Person {
        private String name;
        private String gender;

        private static Map<String, Consumer<String>> FUNC_MAP = new ConcurrentHashMap<>();
        static {
            FUNC_MAP.put(MAN, person-> System.out.println(person + "应该去男厕所!"));
            FUNC_MAP.put(WOMAN, person-> System.out.println(person + "应该去女厕所!"));
        }
        public void goToWC() {
            FUNC_MAP.get(gender).accept(name);
        }

        static class PersonFactory {
            public static Person initPerson(String name, String gender) {
                Person p = new Person();
                p.setGender(gender);
                p.setName(name);
                return p;
            }
        }
    }
    public static void main(String[] args) {
        Person p1 = Person.PersonFactory.initPerson("张三", MAN);
        Person p2 = Person.PersonFactory.initPerson("张三他老婆", WOMAN);
        p1.goToWC();
        p2.goToWC();
    }

}
