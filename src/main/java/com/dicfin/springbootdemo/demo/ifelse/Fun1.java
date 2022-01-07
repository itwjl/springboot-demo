package com.dicfin.springbootdemo.demo.ifelse;

import lombok.Data;

import java.util.Objects;

/**
 * 类描述: 普通人写法
 *
 * @author Wang Jinglei
 * @date 2022/1/7 3:28 下午
 * @modifier Wang Jinglei
 * @date 2022/1/7 3:28 下午
 * @Version V1.0
 */
public class Fun1 {
    private static final String MAN = "man";
    private static final String WOMAN = "woman";
    @Data
    static class Person {
        private String name;
        private String gender;
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setGender(MAN);
        person.setName("张三");
        if (Objects.equals(person.getGender(), MAN)) {
            System.out.println(person.getName() + "应该去男厕所！");
        }
        if (Objects.equals(person.getGender(), WOMAN)) {
            System.out.println(person.getName() + "应该去女厕所！");
        }

    }
}
