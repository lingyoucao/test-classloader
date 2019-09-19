package com.lcs.lean.classloader.proxy.util;

import com.lcs.lean.classloader.proxy.model.Person;
import com.lcs.learn.classloader.model.Star;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by lcs on 2019/9/19.
 *
 * @author liangchangsheng
 */
public class SerializeUtil {

    public static <T> byte[] serialize(T t) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
        outputStream.writeObject(t);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        return bytes;
    }

    /*public static Person deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream);
        Person person = (Person) inputStream.readObject();
        inputStream.close();
        return person;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("zhangsan",3);
        System.out.println("序列化前"+person.toString());
        byte[] bytes = SerializeUtil.serialize(person);
        Person p = SerializeUtil.deserialize(bytes);
        System.out.println("反序列化后"+p.toString());
    }*/


}
