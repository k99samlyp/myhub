package com.sam.uvb76.book.cas;

/**
 * Created by LiYangpan on 2019-02-27  14:31.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class TestSingleton {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();

        for (int i = 0; i< 10; i++){

            new Thread(() -> {
                //SingletonFuller singletonFuller = SingletonFuller.getInstance();
                //SingletonHungry singletonHungry = SingletonHungry.getInstance();
                //SingletonFullerSyn singletonFullerSyn = null;
                //SingletonInnerClass singletonInnerClass = SingletonInnerClass.getInstance();

                SingletonEnum singletonEnum = SingletonEnum.getInstance();
//                try {
//                    singletonFullerSyn = SingletonFullerSyn.getInstance();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                //System.out.println(Thread.currentThread().getId() + "-------我看到的长度是：" + singletonFullerSyn.name.length());


            }).start();
        }
        long end = System.currentTimeMillis();

        //System.out.println("用时："  + (end - start));

    }
}

