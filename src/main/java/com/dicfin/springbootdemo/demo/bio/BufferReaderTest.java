package com.dicfin.springbootdemo.demo.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class BufferReaderTest {

    public static void main(String[] args) {
        String s = null;
        //先使用InputStreamReader将System.in由×Stream转为×Reader，再使用BufferedReader包装×Reader对象。
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //声明一个容器来装入键入的数据。
        ArrayList<String> ls = new ArrayList<>();
        try {
            while ((s = br.readLine()) != null) {//逐行读取，以不分大小写的键入“exit”为结束符号。
                if (s.equalsIgnoreCase("exit"))
                    break;
                ls.add(s);
            }
            String temp;
            //输出容器中的数据并打印到控制器中，并且全部转化为大写。
            for (Iterator<String> it = ls.iterator(); it.hasNext(); ) {
                temp = it.next();
                temp = temp.toUpperCase();
                System.out.println(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
