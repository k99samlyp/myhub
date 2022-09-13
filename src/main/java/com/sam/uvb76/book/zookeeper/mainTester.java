package com.sam.uvb76.book.zookeeper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.*;

/**
 * Created by LiYangpan on 2018/7/29  4:26 PM.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class mainTester {

    private static final Logger LOGGER = LoggerFactory.getLogger(mainTester.class);

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {

        LOGGER.info("完成启动");

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,3, 9L, TimeUnit.MINUTES, new ArrayBlockingQueue<>(3));
        threadPoolExecutor.submit(new Mocker());

//        Thread.sleep(5000);

//        threadPoolExecutor.submit(new Client());

        synchronized (Thread.currentThread()){
            Thread.currentThread().wait();
            LOGGER.info(Thread.currentThread().getName());
        }
    }
}
