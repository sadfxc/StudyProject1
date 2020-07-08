package com.lcy.rpc.myrpc.client;

import java.lang.reflect.Proxy;

public class RpcClientProxy {

    public <T> T clientProxy(final Class<T> interfaceClas,
                             final String host,final int port) {
        return (T) Proxy.newProxyInstance(interfaceClas.getClassLoader(),
                new Class[]{interfaceClas},new RemoteInvocationHandler(host,port));
    }



}
