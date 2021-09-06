package com.dicfin.springbootdemo.demo.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerSocket {
    public static void main(String[] args) throws IOException {
        try {
            java.net.ServerSocket serverSocket = new java.net.ServerSocket(9999);
            while (true) {
                Socket accept = serverSocket.accept();
                InputStream inputStream = accept.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String msg;
                while ((msg = bufferedReader.readLine()) != null) {
                    System.out.println("msg = " + msg);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*System.out.println("==服务器的启动==");
        ExecutorService service= Executors.newCachedThreadPool();
        // 注册端口
        java.net.ServerSocket serverSocket = new java.net.ServerSocket(8888);
        //开始在这里暂停等待接收客户端的连接,得到一个端到端的Socket管道
        while (true){
            System.out.println("线程信息名称:"+Thread.currentThread().getName());
            final  Socket socket=serverSocket.accept();
//             service.submit(new ServerReadThread(socket));

        }*/
    }
}
