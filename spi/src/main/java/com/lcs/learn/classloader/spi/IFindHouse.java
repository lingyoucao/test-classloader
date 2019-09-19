package com.lcs.learn.classloader.spi;

import java.io.IOException;

/**
 * Created by lcs on 2019/9/19.
 *
 * 找房子接口
 *
 * @author liangchangsheng
 */
public interface IFindHouse {

    /**
     * 找房子
     */
    public void find();

    /**
     * 找个陌生人合租，只告诉你二进制
     * 中介者有的对象，客户没有的这种会无法反序列化
     * @return
     */
    public byte[] findPerson() throws IOException;

    /**
     * 找个明星合租，只告诉你二进制
     * 中介者有的对象，客户也有这个对象。 即他们是公共的两个人都认识。
     * @return
     * @throws IOException
     */
    public byte[] findStar() throws IOException;


    /**
     * 找个朋友合租，只告诉你二进制
     * 中介者有的对象，客户也有这个对象。但是这两个对象是由各自持有，包路径一样
     * @return
     * @throws IOException
     */
    public byte[] findFriends() throws IOException;
}
