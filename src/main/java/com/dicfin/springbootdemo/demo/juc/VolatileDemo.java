package com.dicfin.springbootdemo.demo.juc;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class VolatileDemo {
    public static void main(String[] args) throws InterruptedException {
        MyData myData = new MyData();
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    myData.numPlusPlus();
                }
            }).start();
        }
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
//        TimeUnit.SECONDS.sleep(1);
        System.out.println(myData.number);
    }
    
    public static void seeOkVolatile(){
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
    
        int i = 0;
        while(myData.number == 0){
            //            System.out.println("i = " + i++);
        }
        System.out.println(Thread.currentThread().getName() + "main thread get number is " + myData.number);
    }


}
class MyData {
    public volatile int number = 0;

    void addTo60() {
        number = 60;
    }
    
    public synchronized void numPlusPlus(){
        number++;
    }
}