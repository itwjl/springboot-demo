package com.dicfin.springbootdemo.demo.nio.old;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

public class NIOServer {

    private static List<SocketChannel> channelList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(9000));
        serverSocketChannel.configureBlocking(false);
        System.out.println("服务启动成功");

        while (true) {
            SocketChannel socketChannel = serverSocketChannel.accept();
            if (socketChannel != null){
                System.out.println("连接成功");
                socketChannel.configureBlocking(false);
                channelList.add(socketChannel);
            }
        }
    }
}
