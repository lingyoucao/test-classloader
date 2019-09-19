package com.lcs.lean.classloader.client;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by lcs on 2019/9/19.
 *
 * @author liangchangsheng
 */
public class DeserializeUtil {

    public static void deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream);
        Object object =  inputStream.readObject();
        inputStream.close();
        System.out.println("客户端收到的对象：" + object.toString());
        System.out.println("客户端收到的对象的classLoader：" +object.getClass().getClassLoader());
    }
}
