package com.lcy.serial.fastjson;

import com.alibaba.fastjson.JSON;
import com.lcy.serial.ISerializer;

public class FastjsonSerializer implements ISerializer {

    @Override
    public <T> byte[] serializer(T obj) {
        return JSON.toJSONString(obj).getBytes();
    }

    @Override
    public <T> T deSerializer(byte[] data, Class<T> T) {
        return JSON.parseObject(new String(data),T);
    }
}
