package com.lcs.lean.classloader.main;



import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lcs on 2019/8/8.
 *
 * @author lcs
 */
public abstract class AbstractClassLoader extends URLClassLoader {


    public AbstractClassLoader(String[] paths, ClassLoader parent) {
        super(getURLs(paths), parent);
    }

    protected static URL[] getURLs(String[] paths) {
        if (paths == null || paths.length == 0) {
            throw new RuntimeException("jar包路径不能为空");
        }
        List<String> dirs = new ArrayList<String>();
        for (String path : paths) {
            dirs.add(path);
            collectDirs(path, dirs);
        }
        List<URL> urls = new ArrayList<>();
        for (String path : dirs) {
            urls.addAll(doGetURLs(path));
        }
        return urls.toArray(new URL[0]);
    }

    protected static void collectDirs(String path, List<String> collector) {
        if (path == null || path.isEmpty()) {
            return;
        }
        File current = new File(path);
        if (!current.exists() || !current.isDirectory()) {
            return;
        }
        for (File child : current.listFiles()) {
            if (!child.isDirectory()) {
                continue;
            }
            collector.add(child.getAbsolutePath());
            collectDirs(child.getAbsolutePath(), collector);
        }
    }

    protected static List<URL> doGetURLs(final String path) {
        if (path == null || path.isEmpty()) {
            throw new RuntimeException("jar包路径不能为空");
        }
        File jarPath = new File(path);
        if (!jarPath.exists() || !jarPath.isDirectory()) {
            throw new RuntimeException("路径不存在或不是目录[" + path + "]");
        }
        FileFilter jarFilter = pathName -> pathName.getName().endsWith(".jar");
        File[] allJars = new File(path).listFiles(jarFilter);
        List<URL> jarURLs = new ArrayList<>(allJars.length);

        for (int i = 0; i < allJars.length; i++) {
            try {
                jarURLs.add(allJars[i].toURI().toURL());
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("系统加载jar包出错");
            }
        }
        return jarURLs;
    }
}
