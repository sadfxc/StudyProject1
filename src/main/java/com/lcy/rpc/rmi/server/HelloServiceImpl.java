package com.lcy.rpc.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl extends UnicastRemoteObject implements IHelloService {


    protected HelloServiceImpl() throws RemoteException {
        super();
    }


    @Override
    public String sayHallo(String msg) throws RemoteException{
        System.out.println(msg);
        return "Hello,"+msg;
    }
}
