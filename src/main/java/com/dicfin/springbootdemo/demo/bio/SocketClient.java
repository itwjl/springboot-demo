package com.dicfin.springbootdemo.demo.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {

    public static void main(String[] args) throws IOException {
        /*Socket socket = new Socket("127.0.0.1", 9999);
        OutputStream outputStream = socket.getOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请说：");
            String msg = sc.nextLine();
            printStream.print(msg);
            printStream.flush();
        }*/

        System.out.println("客户端的启动");
        //创建一个socket通信管道，请求与服务端端口连接
        Socket socket = new Socket("127.0.0.1", 9999);
        //从socket通信管道中得到一个字节输出流
        OutputStream os = socket.getOutputStream();
        InputStream in=socket.getInputStream();


        //把字节流改装成自己需要的流进行数据发送
        PrintStream ps = new PrintStream(os);

        Scanner scanner=new Scanner(System.in);
        while (true){

            System.out.print("请说:");
            String str=scanner.nextLine();
            ps.println(str);
            ps.flush();
        }
    }

}
