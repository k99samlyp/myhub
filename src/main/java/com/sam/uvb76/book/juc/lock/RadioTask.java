package com.sam.uvb76.book.juc.lock;

import lombok.SneakyThrows;

import java.util.concurrent.locks.ReentrantLock;

public class RadioTask implements Runnable {

    @SneakyThrows
    @Override
    public void run() {
        MainStarter.radioLock.lock();
        System.out.println(Thread.currentThread().getId() + "-在发送电波");
        System.out.println(Thread.currentThread().getId() + "-getHoldCount" + MainStarter.radioLock.getHoldCount());
        System.out.println(Thread.currentThread().getId() + "-getQueueLength" + MainStarter.radioLock.getQueueLength());
        Thread.sleep(5000);
        MainStarter.radioLock.unlock();
    }
}
