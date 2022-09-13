package com.sam.uvb76.book.juc;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;

import static com.sam.uvb76.book.juc.testMain.CYCLIC_BARRIER;

//import static com.sam.uvb76.book.juc.testMain.CYCLIC_BARRIER;

public class Uvb76Task implements Runnable {

    final static ThreadLocal aaa = new ThreadLocal();


    @Override
    public void run() {
        

        aaa.set(9800 + Thread.currentThread().getId());


        System.out.println(aaa.get());

        System.out.println(Thread.currentThread().getName() + "----" + Thread.currentThread().getId() + "----" + Thread.currentThread().getContextClassLoader() + "Start");

        Random random = new Random();
        try {
            for(int y = 0 ;y < 100 ; y++){
                Thread.sleep(500);
                testMain.ati.getAndAdd(1);
            }
            for(int y = 0 ;y < 100 ; y++){
                Thread.sleep(500);
                testMain.ati.getAndAdd(-1);
            }
//            Thread.sleep(random.nextInt(5000));
            Thread.sleep(1000);

            CYCLIC_BARRIER.await();

            System.out.println(Thread.currentThread().getName() + "----" + Thread.currentThread().getId() + "----" + Thread.currentThread().getContextClassLoader() + "Over!!!");

        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }


        aaa.get();

        testMain.COUNT_DOWN_LATCH.countDown();


    }
}
