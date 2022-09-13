package com.sam.uvb76.book.juc;

import java.util.Random;
import java.util.concurrent.Callable;

public class Uvb76Callable implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "----" + Thread.currentThread().getId() + "----" + Thread.currentThread().getContextClassLoader() + "Start");

        Thread.sleep(5000);

        System.out.println(Thread.currentThread().getName() + "----" + Thread.currentThread().getId() + "----" + Thread.currentThread().getContextClassLoader() + "Over!!!");


        return Thread.currentThread().getName();
    }
}
