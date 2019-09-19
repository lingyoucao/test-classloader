package com.lcs.lean.classloader.main;

import java.net.URL;

/**
 * Created by lcs on 2019/7/29.
 * 根据jar包路径加载路径下的所有jar文件
 * @author lcs
 */
public class ClientClassLoader extends AbstractClassLoader {
    public ClientClassLoader(String[] paths) {
        super(paths, ClientClassLoader.class.getClassLoader());
    }

    public ClientClassLoader(String[] paths, ClassLoader parent) {
        super(paths, parent);
    }

    /**
     * 新增新的路径到class loader中
     *
     * @param paths jar路径
     */
    public void addURL(String[] paths) {
        URL[] urLs = getURLs(paths);
        for (URL urL : urLs) {
            addURL(urL);
        }
    }
}
