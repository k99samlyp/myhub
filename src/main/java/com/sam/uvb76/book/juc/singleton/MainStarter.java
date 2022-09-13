package com.sam.uvb76.book.juc.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainStarter {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadpool = Executors.newFixedThreadPool(8);

        threadpool.submit(new FactoryTask());
        threadpool.submit(new FactoryTask());
        threadpool.submit(new FactoryTask());
        threadpool.submit(new FactoryTask());
        threadpool.submit(new FactoryTask());
        threadpool.submit(new FactoryTask());
        threadpool.submit(new FactoryTask());
        threadpool.submit(new FactoryTask());
    }
}
