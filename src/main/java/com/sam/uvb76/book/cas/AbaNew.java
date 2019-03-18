package com.sam.uvb76.book.cas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * Created by LiYangpan on 2018-12-26  10:38.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class AbaNew {

    private static Logger log = LoggerFactory.getLogger(AbaNew.class);

    static AtomicInteger ai = new AtomicInteger(100);

    static AtomicStampedReference<Integer> asp = new AtomicStampedReference<Integer>(100,9800);

    static volatile int sum = 100;



    public static void main(String[] args) throws Exception {

        final CountDownLatch countDownLatch = new CountDownLatch(1);


        Random random = new Random();

        for (int i = 0; i< 20; i++){

            new Thread(() -> {

                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    Thread.sleep(random.nextInt() & 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

//                if (ai.compareAndSet(100,200)){
//                    System.out.println(Thread.currentThread().getId() + "----" + ai.get() + "-----");
//                }

//                if (asp.compareAndSet(100,200,asp.getStamp(),9801)){
//                    System.out.println(Thread.currentThread().getId() + "----" + asp.getReference() + "-----" + asp.getStamp());
//                }

                System.out.println(Thread.currentThread().getId() + "----" + asp.getReference() + "-----" + asp.compareAndSet(asp.getReference(),200,asp.getStamp(),asp.getStamp() + 1) + "----" + asp.getStamp());
//                System.out.println(Thread.currentThread().getId() + "----" + ai.get() + "-----" + ai.compareAndSet(ai.get(),200));

            }).start();
        }
        Thread.sleep( 200);
        countDownLatch.countDown();

        new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //ai.compareAndSet(200,100);

            int stamp = asp.getStamp();

            while (!asp.compareAndSet(asp.getReference(),900, stamp,stamp + 1)){
                stamp = asp.getStamp();
            }

//            if (asp.compareAndSet(asp.getReference(),900, asp.getStamp(),asp.getStamp() + 1)){
//                System.out.println("更新成了900");
//            }

//            if (ai.compareAndSet(ai.get(),800)){
//                System.out.println("更新成了800");
//            }

            //System.out.println(Thread.currentThread().getId() + "-----" + ai.compareAndSet(200,100));
            //asp.set(100,asp.getStamp());
//            System.out.println(Thread.currentThread().getId() + "-----"   + "----" + asp.getStamp());



        }).start();



        Thread.sleep( 2000);
        System.out.println(Thread.currentThread().getId() + "----" + asp.getReference() + "-----" + asp.getStamp());
//        System.out.println(Thread.currentThread().getId() + "----" + ai.get() + "-----");


    }


}
