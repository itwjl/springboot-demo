package com.dicfin.springbootdemo.demo.juc;

import java.util.concurrent.TimeUnit;

public class VolatileDemo {
    public static void main(String[] args) {
        MyData myData = new MyData();
        new Thread( () -> {
            System.out.println(Thread.currentThread().getName() + " come in");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myData.addTo60();
            System.out.println(Thread.currentThread().getName() + " updated new value: " + myData.number);

        }, "aaa").start();

        while(myData.number == 0){

        }
        System.out.println("number = " + myData.number);
    }


}
class MyData {
    int number = 0;

    void addTo60() {
        number = 60;
    }
}