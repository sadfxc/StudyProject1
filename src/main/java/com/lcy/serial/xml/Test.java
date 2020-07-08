package com.lcy.serial.xml;

import com.lcy.serial.ISerializer;
import com.lcy.serial.User;
import com.thoughtworks.xstream.io.xml.SjsxpDriver;

public class Test {

    public static void main(String[] args) {

        User user = new User("zs",18,"男");
        ISerializer serializer = new XmlSerializer();
        byte[] data = serializer.serializer(user);
        System.out.println(new String(data));

        User user1 = serializer.deSerializer(data, User.class);
        System.out.println(user1);


    }


}
