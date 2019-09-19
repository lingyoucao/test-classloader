package com.lcs.learn.classloader.model;

import java.io.Serializable;

/**
 * Created by lcs on 2019/9/19.
 *
 * @author liangchangsheng
 */
public class Star implements Serializable {
    private static final long serialVersionUID = -6764009248106077299L;
    public String name;
    public String sex;

    public Star(String name,String sex) {
        this.name = name;
        this.sex = sex;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
