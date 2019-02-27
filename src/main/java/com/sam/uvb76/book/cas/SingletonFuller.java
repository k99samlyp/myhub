package com.sam.uvb76.book.cas;

/**
 * Created by LiYangpan on 2019-02-27  14:20.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述: 懒加载模式  线程不安全  未加synchronized
 */
public class SingletonFuller {

    private static SingletonFuller ourInstance;

    public static SingletonFuller getInstance() {
        if (ourInstance == null){
            ourInstance = new SingletonFuller();
            return ourInstance;
        }
        return ourInstance;
    }

    private SingletonFuller() {

        System.out.println("initialized !!!!");
    }
}
