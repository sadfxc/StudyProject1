package com.lcy.rpc.myrpc.service;

public class HelloImpl implements IHello {

    @Override
    public String sayHello(String msg) {
        return "hello " +msg;
    }
}
