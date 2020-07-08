package com.lcy.rpc.rmi.client;

import com.lcy.rpc.rmi.server.IHelloService;

import java.rmi.Naming;

public class ClientDemo {

    public static void main(String[] args) {
        try {
            IHelloService helloService = (IHelloService)Naming.lookup("rmi://127.0.0.1/Hello");
            String result = helloService.sayHallo("lcy");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
