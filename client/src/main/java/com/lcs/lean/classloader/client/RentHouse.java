package com.lcs.lean.classloader.client;

import com.lcs.learn.classloader.spi.IFindHouse;
import com.lcs.learn.classloader.spi.IRentHouse;

import java.io.IOException;

/**
 * Created by lcs on 2019/9/19.
 *
 * @author liangchangsheng
 */
public class RentHouse implements IRentHouse {
    private IFindHouse findHouse;

    @Override
    public void setFind(IFindHouse findHouse) {
        this.findHouse = findHouse;
    }

    @Override
    public void findHouseAndRent() {
        this.findHouse.find();
    }

    @Override
    public void setPerson(byte[] bytes) {
        try {
            DeserializeUtil.deserialize(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void setFriends(byte[] bytes) {
        try {
            DeserializeUtil.deserialize(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
