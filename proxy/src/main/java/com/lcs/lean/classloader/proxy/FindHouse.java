package com.lcs.lean.classloader.proxy;

import com.lcs.lean.classloader.Friends;
import com.lcs.lean.classloader.proxy.model.House;
import com.lcs.lean.classloader.proxy.model.Person;
import com.lcs.lean.classloader.proxy.util.SerializeUtil;
import com.lcs.learn.classloader.model.Star;
import com.lcs.learn.classloader.spi.IFindHouse;

import java.io.IOException;

/**
 * Created by lcs on 2019/9/19.
 *
 * @author liangchangsheng
 */
public class FindHouse implements IFindHouse {
    @Override
    public void find() {
        House house = new House();
        house.setAddress("东方名城");
        house.setRoomNumber("89#306");
        System.out.println(house.toString());
    }

    @Override
    public byte[] findPerson() throws IOException {
        Person person = new Person("张三",20);
        return SerializeUtil.serialize(person);
    }

    @Override
    public byte[] findStar() throws IOException {
        Star star = new Star("杨幂","女");
        return SerializeUtil.serialize(star);
    }

    @Override
    public byte[] findFriends() throws IOException {
        Friends friends = new Friends("张三",20);
        return SerializeUtil.serialize(friends);
    }
}
