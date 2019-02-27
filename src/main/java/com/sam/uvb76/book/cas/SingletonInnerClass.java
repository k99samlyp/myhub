package com.sam.uvb76.book.cas;

/**
 * Created by LiYangpan on 2019-02-27  14:20.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述: 饿汉模式，线程安全
 */
public class SingletonInnerClass {

    private static class INSTANCEHOLDER {
        private static SingletonInnerClass ourInstance = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance() {
        return INSTANCEHOLDER.ourInstance;
    }

    private SingletonInnerClass() {
        System.out.println("initialized !!!!");
    }
}
