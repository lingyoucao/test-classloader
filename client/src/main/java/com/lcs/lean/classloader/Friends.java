package com.lcs.lean.classloader;

import java.io.Serializable;

/**
 * Created by lcs on 2019/9/19.
 *
 * @author liangchangsheng
 */
public class Friends implements Serializable  {
    private static final long serialVersionUID = 4493212244915985813L;
    public String name;
    public int age;

    public Friends(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
