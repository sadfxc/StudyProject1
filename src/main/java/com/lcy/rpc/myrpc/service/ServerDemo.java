package com.lcy.rpc.myrpc.service;

import java.io.IOException;

public class ServerDemo {

    public static void main(String[] args) {
        IHello iHello = new HelloImpl();
        RpcServer server = new RpcServer();
        server.publisher(iHello,8888);


    }


}
