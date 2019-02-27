package com.sam.uvb76.book.cas;

/**
 * Created by LiYangpan on 2019-02-27  14:20.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述: 饿汉模式，线程安全
 */
public class SingletonHungry {
    private static SingletonHungry ourInstance = new SingletonHungry();

    public static SingletonHungry getInstance() {
        return ourInstance;
    }

    private SingletonHungry() {
        System.out.println("initialized !!!!");
    }
}
