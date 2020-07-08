package com.lcy.rpc.myrpc.service;

import com.lcy.rpc.myrpc.client.RpcRequest;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;

public class ProcessorHandler implements Runnable {

    private Socket socket;
    private Object server;
    ProcessorHandler(Socket socket,Object server) {
        this.socket = socket;
        this.server = server;
    }


    @Override
    public void run() {
        System.out.println(socket);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream())){
            RpcRequest request = (RpcRequest)inputStream.readObject();
            Object result = invoke(request);
            outputStream.writeObject(result);
            outputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private Object invoke(RpcRequest request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object[] parameters = request.getParameters();
        Class<?>[] types = new Class[parameters.length];
        for (int i = 0; i < parameters.length; i++) {
            types[i] = parameters[i].getClass();
        }
        Method method = server.getClass().getMethod(request.getMethodName(), types);
        return method.invoke(server,parameters);
    }

}
