package com.dicfin.springbootdemo.demo.reflection;

import static java.lang.Integer.TYPE;
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1. 通过类的全路径名获取
        Class<?> clz1 = Class.forName("com.dicfin.springbootdemo.demo.reflection.Car");
        System.out.println("car = " + clz1);
        // 2. 通过类名获取类对象
        Class<Car> clz2 = Car.class;
        System.out.println("carClass = " + clz2);
        // 3. 通过类对象获取类对象
        Car car1 = new Car();
        Class<? extends Car> clz3 = car1.getClass();
        // 4. 通过类加载器获取类对象
        ClassLoader classLoader = car1.getClass().getClassLoader();
        String classAllPath = "com.dicfin.springbootdemo.demo.reflection.Car";
        Class<?> clz4 = classLoader.loadClass(classAllPath);
        System.out.println(clz1.hashCode());
        System.out.println(clz2.hashCode());
        System.out.println(clz3.hashCode());
        System.out.println(clz4.hashCode());
        Class<Integer> integerClass = Integer.class;
        System.out.println(integerClass.hashCode());
        Class<Integer> integerClass1 = int.class;
        System.out.println(integerClass1.hashCode());
        System.out.println(void.class);
        System.out.println(Double.class);
    }
}
