package com.dicfin.springbootdemo.demo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @ClassName SocketClient
 * @Author Wang Jinglei
 * @Date 2021/8/24 17:32
 * @Version 2.0
 */
public class SocketClient {
    
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 9000);
//            socket.connect(new InetSocketAddress(9001));
            Scanner scanner = new Scanner(System.in);
            String next = scanner.next();
            
            socket.getOutputStream().write(next.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
