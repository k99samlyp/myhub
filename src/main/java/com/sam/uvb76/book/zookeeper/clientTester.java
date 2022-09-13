package com.sam.uvb76.book.zookeeper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by LiYangpan on 2018/7/29  4:26 PM.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class clientTester {

    private static final Logger LOGGER = LoggerFactory.getLogger(clientTester.class);

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
        LOGGER.info("客户端完成启动");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,3, 9L, TimeUnit.MINUTES, new ArrayBlockingQueue<>(3));
        threadPoolExecutor.submit(new Client());

        synchronized (Thread.currentThread()){
            Thread.currentThread().wait();
            LOGGER.info(Thread.currentThread().getName());
        }
    }
}
