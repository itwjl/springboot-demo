package com.dicfin.springbootdemo.demo.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(9000);
        while (true) {
            System.out.println("wait connect ...");
            Socket clientSocket = socket.accept();
            System.out.println("connect by client");
            handler(clientSocket);
        }
    }

    private static void handler(Socket clientSocket) throws IOException {
        byte[] bytes = new byte[1024];
        System.out.println("prepare read ...");
        InputStream inputStream = clientSocket.getInputStream();
        int read = inputStream.read(bytes);
        System.out.println("read success ...");
        if (read != -1) {
            System.out.println("client accepted data is: " + new String(bytes, 0, read));
        }
    }
}
