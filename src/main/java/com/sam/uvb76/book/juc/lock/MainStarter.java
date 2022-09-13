package com.sam.uvb76.book.juc.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class MainStarter {

    static final ReentrantLock radioLock = new ReentrantLock();


    public static void main(String[] args) throws InterruptedException {

        ExecutorService threadpool = Executors.newFixedThreadPool(4);

        threadpool.submit(new RadioTask());
        threadpool.submit(new RadioTask());
        threadpool.submit(new RadioTask());
        threadpool.submit(new RadioTask());
    }

}
