package com.lcy.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceDemo {

    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(8080);
            Socket socket = server.accept();
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter os = new PrintWriter(socket.getOutputStream());

            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));

            //拿到客户端的信息
            System.out.println("Client:"+is.readLine());

            String line = sin.readLine();
            while (!line.equals("bye")) {
                os.println(line);//输出数据
                os.flush();
                System.out.println("Server:"+line);
                System.out.println("Client:"+is.readLine());
                line = sin.readLine();
            }

            os.close();
            is.close();
            socket.close();


        } catch (Exception e){
            e.printStackTrace();
        }

    }


}
