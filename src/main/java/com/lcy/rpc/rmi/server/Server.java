package com.lcy.rpc.rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) throws RemoteException,MalformedURLException {
        IHelloService helloService = null;
        helloService = new HelloServiceImpl();
        LocateRegistry.createRegistry(1099);
        Naming.rebind("rmi://127.0.0.1/Hello",helloService);
        System.out.println("服务启动成功");
    }

}
