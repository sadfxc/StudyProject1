package com.lcy.rpc.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHelloService extends Remote {

    String sayHallo(String msg) throws RemoteException;


}
