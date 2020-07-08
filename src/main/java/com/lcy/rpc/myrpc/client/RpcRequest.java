package com.lcy.rpc.myrpc.client;

import lombok.Data;

import java.io.Serializable;

/**
 * 传输对象
 */
@Data
public class RpcRequest implements Serializable {

    private static final long serialVersionUID = -108554976156203019L;
    private String className;
    private String methodName;
    private Object[] parameters;

    public RpcRequest() {
    }

    public RpcRequest(String className, String methodName, Object[] parameters) {
        this.className = className;
        this.methodName = methodName;
        this.parameters = parameters;
    }
}
