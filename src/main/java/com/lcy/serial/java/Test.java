package com.lcy.serial.java;

import com.lcy.serial.ISerializer;
import com.lcy.serial.User;

public class Test {

    public static void main(String[] args) {
        JavaSerializerTest();
    }



    public static void JavaSerializerTest() {
        User user = new User("zs",18,"男");
        user.setNotSerializeble("1111");
        User.num = 10;
        ISerializer iSerializer = new JavaSerializer();
        byte[] serializer = iSerializer.serializer(user);
        System.out.println(serializer);
        User user1 = iSerializer.deSerializer(serializer, User.class);
        System.out.println(user1.toString());


    }



}
