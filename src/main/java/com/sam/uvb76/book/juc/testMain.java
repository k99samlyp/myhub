package com.sam.uvb76.book.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class testMain {

    public static void main(String[] args) throws ClassNotFoundException {

        ExecutorService threadpool = Executors.newScheduledThreadPool(2);

//        threadpool.submit(() -> {
//            System.out.println(Thread.currentThread().getName() + "is running");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });


        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println(Thread.currentThread().getName() + "is running");
        },1,2, TimeUnit.SECONDS);


        threadpool.shutdown();




    }



}
