package com.lcy.serial.fastjson;

import com.lcy.serial.ISerializer;
import com.lcy.serial.User;
import com.lcy.serial.xml.XmlSerializer;

public class Test {




    public static void main(String[] args) {
        ISerializer fastjsonSerializer = new FastjsonSerializer();

        User user = new User("zs",18,"男");
        byte[] serializer = fastjsonSerializer.serializer(user);
        System.out.println(new String(serializer));

        User user1 = fastjsonSerializer.deSerializer(serializer, User.class);
        System.out.println(user1);


    }


}
