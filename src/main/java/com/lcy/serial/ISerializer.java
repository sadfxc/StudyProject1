package com.lcy.serial;

public interface ISerializer {


    <T> byte[] serializer(T obj);

    <T> T deSerializer(byte[] data,Class<T> T);


}
