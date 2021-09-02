package com.dicfin.springbootdemo.demo.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerSocket {
    public static void main(String[] args) {
        try {
            java.net.ServerSocket serverSocket = new java.net.ServerSocket(9999);
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String msg;
            while ((msg = bufferedReader.readLine()) != null) {
                System.out.println("msg = " + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
