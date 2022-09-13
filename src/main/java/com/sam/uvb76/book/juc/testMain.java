package com.sam.uvb76.book.juc;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class testMain {

//    volatile static int count = 100;

//    final static ThreadLocal aaa = new ThreadLocal();

    final static CountDownLatch COUNT_DOWN_LATCH = new CountDownLatch(4);

    final static CyclicBarrier CYCLIC_BARRIER = new CyclicBarrier(4);


    static AtomicInteger ati = new AtomicInteger(100);

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException, BrokenBarrierException {

        ExecutorService threadpool = Executors.newFixedThreadPool(4);

        threadpool.submit(new Uvb76Task());
        threadpool.submit(new Uvb76Task());
        threadpool.submit(new Uvb76Task());
        threadpool.submit(new Uvb76Task());
        threadpool.submit(new Uvb76Task());
        threadpool.submit(new Uvb76Task());
        threadpool.submit(new Uvb76Task());
        threadpool.submit(new Uvb76Task());
//
//
//        //COUNT_DOWN_LATCH.await();
//
//        System.out.println(ati);
//
//        System.out.println("全部执行完毕");
//
//        aaa.set("555");
//
//        aaa.get();

       // threadpool.shutdown();


//        Uvb76Task aaa = new Uvb76Task();

//        aaa.run();

//        Thread t1 = new Thread(aaa);


//        t1.start();

        System.out.println("全部执行完毕");





//        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
//
//        scheduledExecutorService.scheduleAtFixedRate(() -> {
//            System.out.println(Thread.currentThread().getName() + "is running");
//        },1,2, TimeUnit.SECONDS);


//        threadpool.shutdown();


//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,3,9l,TimeUnit.MINUTES, new ArrayBlockingQueue<>(3));
//
//        threadPoolExecutor.shutdown();



    }



}
