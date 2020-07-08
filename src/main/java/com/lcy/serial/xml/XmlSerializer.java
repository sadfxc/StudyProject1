package com.lcy.serial.xml;

import com.lcy.serial.ISerializer;
import com.thoughtworks.xstream.XStream;

public class XmlSerializer implements ISerializer {

    XStream xStream = new XStream();

    @Override
    public <T> byte[] serializer(T obj) {
        return xStream.toXML(obj).getBytes();
    }

    @Override
    public <T> T deSerializer(byte[] data, Class<T> T) {
        return (T)xStream.fromXML(new String(data));
    }
}
