package com.lcs.lean.classloader.main;

import com.lcs.learn.classloader.spi.IFindHouse;
import com.lcs.learn.classloader.spi.IRentHouse;

/**
 * Created by lcs on 2019/9/19.
 *
 * @author liangchangsheng
 */
public class Launch {

    public static void main(String[] args) throws Exception {

        ProxyClassLoader proxyClassLoader = new ProxyClassLoader(new String[]{"G:\\renthouse\\proxy"});
        ClientClassLoader clientClassLoader = new ClientClassLoader(new String[]{"G:\\renthouse\\client"});
        // 初始化代理找房子
        Class<?> aClass = Class.forName("com.lcs.lean.classloader.proxy.FindHouse", true, proxyClassLoader);
        IFindHouse findHouse = (IFindHouse)aClass.newInstance();

        // 初始化客户
        Class<?> bClass = Class.forName("com.lcs.lean.classloader.client.RentHouse", true, clientClassLoader);
        IRentHouse rentHouse = (IRentHouse)bClass.newInstance();
        rentHouse.setFind(findHouse);
        rentHouse.findHouseAndRent();


        System.out.println("随便找个人=======");
        // 二进制测试,找陌生人合租，不识别会报错。中介找了个陌生人，用户没有这个人，会报错。
        rentHouse.setPerson(findHouse.findPerson());

        System.out.println("找明星=======");
        // 二进制测试,找明星合租。中介找了个明星，中介有这个对象，用户也有这个对象。不会报错
        rentHouse.setPerson(findHouse.findStar());

        System.out.println("找朋友=======");
        // 二进制测试,找朋友合租。中介找了个朋友，刚好用户也认识这个朋友。他们有同名的类，且包路径一样。不会报错
        rentHouse.setFriends(findHouse.findFriends());
    }
}
