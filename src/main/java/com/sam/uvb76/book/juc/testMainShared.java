package com.sam.uvb76.book.juc;

import java.util.HashMap;
import java.util.concurrent.*;

public class testMainShared {

    volatile static int TICKETS = 2000;

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException, BrokenBarrierException {

        ExecutorService threadpool = Executors.newFixedThreadPool(4);

        threadpool.submit(() -> {
            while (TICKETS > 0){
                try {
                    TICKETS--;
                    Thread.sleep(500);
                    System.out.println("减少了--->" + TICKETS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        threadpool.submit(() -> {
            int oldvalue = TICKETS;
            while (TICKETS != 0){
                if (TICKETS != oldvalue){
                    System.out.println("看到变化了," + oldvalue + "---> 最新值是" + TICKETS);
                    oldvalue = TICKETS;
                }
                continue;
            }
        });


       threadpool.shutdown();


    }


}
