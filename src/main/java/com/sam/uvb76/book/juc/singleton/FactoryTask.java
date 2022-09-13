package com.sam.uvb76.book.juc.singleton;

import lombok.SneakyThrows;

/**
 * 工厂方法
 */
public class FactoryTask implements Runnable{

    @SneakyThrows
    @Override
    public void run() {
        SingletonFooFactory singletonFoo = SingletonFooFactory.getSingletonFoo();
        System.out.println(Thread.currentThread().getId() + singletonFoo.toString());
    }
}
