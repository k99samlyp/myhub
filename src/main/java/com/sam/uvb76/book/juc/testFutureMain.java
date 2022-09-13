package com.sam.uvb76.book.juc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class testFutureMain {

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException, ExecutionException, TimeoutException {

        ExecutorService threadpool = Executors.newFixedThreadPool(4);


        List<Future> farray = new ArrayList<>();

        farray.add(threadpool.submit(new Uvb76Callable()));
        farray.add(threadpool.submit(new Uvb76Callable()));
        farray.add(threadpool.submit(new Uvb76Callable()));
        farray.add(threadpool.submit(new Uvb76Callable()));
        farray.add(threadpool.submit(new Uvb76Callable()));
        farray.add(threadpool.submit(new Uvb76Callable()));
        farray.add(threadpool.submit(new Uvb76Callable()));


        for (Future f : farray){
            System.out.println(f.get(1, TimeUnit.SECONDS));
        }

        threadpool.shutdown();



    }



}
