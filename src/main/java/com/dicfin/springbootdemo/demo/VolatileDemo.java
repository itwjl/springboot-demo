package com.dicfin.springbootdemo.demo;

import org.apache.commons.lang3.RandomUtils;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 类描述:
 *
 * @author Wang Jinglei
 * @date 2021/12/23 8:50 下午
 * @modifier Wang Jinglei
 * @date 2021/12/23 8:50 下午
 * @Version V1.0
 */
public class VolatileDemo {


    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger(100);
        new Thread(() -> {
            try {
                Thread.sleep(3000);
                a.set(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            while (a.get() == 0) {
            }
            System.out.println("break");
        }).start();

    }

    static class MyNumber {
        volatile int number = 0;

        public void addNumber() {
            this.number = 100;
        }
    }

    static class MainClass {
        public static void main(String[] args) {
            MyNumber myNumber = new MyNumber();
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t 进入了，准备操作数据");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                myNumber.addNumber();
                System.out.println(Thread.currentThread().getName() + "\t 更新数据完成，更新完后值为：" + myNumber.number);
            }, "线程A").start();
            while (myNumber.number == 0) {
            }
            System.out.println("===============" + Thread.currentThread().getName() + "================运行结束");
        }
    }
}
