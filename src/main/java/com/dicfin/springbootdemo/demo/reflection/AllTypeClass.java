package com.dicfin.springbootdemo.demo.reflection;

import java.io.Serializable;

public class AllTypeClass {
    public static void main(String[] args) {
        Class<String> cls1 = String.class;
        Class<Serializable> cls2 = Serializable.class;
        Class<Integer[]> cls3 = Integer[].class;
        Class<Integer[][]> cls4 = Integer[][].class;
        Class<Deprecated> cls5 = Deprecated.class; // 注解
        Class<Thread.State> cls6 = Thread.State.class; // 枚举
        Class<Long> cls7 = long.class;
        Class<Void> cls8 = void.class;
        Class<Class> cls9 = Class.class;

        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);
        System.out.println(cls4);
        System.out.println(cls5);
        System.out.println(cls6);
        System.out.println(cls7);
        System.out.println(cls8);
        System.out.println(cls9);

    }
}
