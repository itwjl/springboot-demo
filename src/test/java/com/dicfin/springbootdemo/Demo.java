package com.dicfin.springbootdemo;

import sun.security.action.GetPropertyAction;

import java.security.AccessController;

public class Demo {
    public static void main(String[] args) {
//        String osname = AccessController
//                .doPrivileged(new GetPropertyAction("os.name"));
//        System.out.println(osname);
        
        String a = "\\{a}\\{b}";
        String b = "{a}{b}";
//        String p = String.format("%s", "haha");
        String sss = b.replaceAll(a, "sss1");
        System.out.println(a);
        System.out.println("b = " + b);
        System.out.println("sss = " + sss);
    }
}
