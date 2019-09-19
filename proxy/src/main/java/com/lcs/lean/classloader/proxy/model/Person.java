package com.lcs.lean.classloader.proxy.model;

import java.io.Serializable;

/**
 * Created by lcs on 2019/9/19.
 *
 * @author liangchangsheng
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -5087031957385066380L;

    public String name;
    public int age;

    public Person(String name, int age) {
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
