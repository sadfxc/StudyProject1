package com.lcy.rpc.myrpc.client;

public class ClientDemo {

    public static void main(String[] args) {
        RpcClientProxy proxy = new RpcClientProxy();
        IHello hello = proxy.clientProxy(IHello.class, "127.0.0.1", 8888);
        String lcy = hello.sayHello("lcy");
        System.out.println(lcy);
        String json = "{" +
                "\"name\": zs," +
                " \"age\": 25" +
                "}";
    }


}
