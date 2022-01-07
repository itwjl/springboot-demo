package com.dicfin.springbootdemo.demo.ifelse;

import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * 类描述: Lambda策略模式写法
 *
 * @author Wang Jinglei
 * @date 2022/1/7 3:33 下午
 * @modifier Wang Jinglei
 * @date 2022/1/7 3:33 下午
 * @Version V1.0
 */
public class Fun2 {
    private static Map<String, Consumer<String>> FUNC_MAP = new ConcurrentHashMap<>();
    private static final String MAN = "man";
    private static final String WOMAN = "woman";
    static {
        FUNC_MAP.put(MAN, person -> System.out.println(person + "应该去男厕所！"));
        FUNC_MAP.put(WOMAN, person -> System.out.println(person + "应该去女厕所！"));
    }
    @Data
    static class Person {
        private String name;
        private String gender;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setGender(MAN);
        p1.setName("张三");
        p2.setName("张三他老婆");
        p2.setGender(WOMAN);
        FUNC_MAP.get(p1.getGender()).accept(p1.getName());
        FUNC_MAP.get(p2.getGender()).accept(p2.getName());
    }
}

