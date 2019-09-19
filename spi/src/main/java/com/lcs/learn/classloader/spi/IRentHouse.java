package com.lcs.learn.classloader.spi;

/**
 * Created by lcs on 2019/9/19.
 *
 * @author liangchangsheng
 */
public interface IRentHouse {
    public void findHouseAndRent();
    public void setFind(IFindHouse findHouse);

    /**
     * 我只告诉你合租的人的二进制，你要自己反序列化成合租的人
     * @param bytes
     */
    public void setPerson(byte[] bytes);
    public void setFriends(byte[] bytes);
}
