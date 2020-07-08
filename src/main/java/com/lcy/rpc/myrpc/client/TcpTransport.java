package com.lcy.rpc.myrpc.client;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpTransport {

    private String host;
    private int port;

    public TcpTransport(String host, int port) {
        this.host = host;
        this.port = port;
    }

    private Socket newSoket() {
        try {
            return new Socket(host,port);
        } catch (Exception e) {
            throw new RuntimeException("连接建立失败");
        }
    }

    public Object send(RpcRequest request) {
        try (Socket socket = newSoket();
             ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream())){
            outputStream.writeObject(request);
            outputStream.flush();
            Object result = inputStream.readObject();
            return result;
        } catch (Exception e) {
            System.out.println("传输失败："+e);
        }
        return null;
    }


}
