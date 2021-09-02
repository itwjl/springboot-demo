package com.dicfin.springbootdemo;

import sun.security.action.GetPropertyAction;

import java.security.AccessController;

public class Demo {
    public static void main(String[] args) {
        String osname = AccessController
                .doPrivileged(new GetPropertyAction("os.name"));
        System.out.println(osname);
    }
}
