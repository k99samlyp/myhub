package com.sam.uvb76.book.cas;

/**
 * Created by LiYangpan on 2019-02-27  14:20.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述: 懒加载模式  线程安全  加sychronized
 */
public class SingletonFullerSyn {
    private volatile static SingletonFullerSyn ourInstance;

    String name = null;

    /**
     * 锁方法
     * @return
     */
//    public static synchronized SingletonFullerSyn getInstance() throws InterruptedException {
//        if (ourInstance == null){
//            ourInstance = new SingletonFullerSyn();
//            return ourInstance;
//        }
//        return ourInstance;
//    }

    /**
     * 锁类
     * @return
     */
//    public static SingletonFullerSyn getInstance() throws InterruptedException {
//        synchronized (SingletonFullerSyn.class){
//            if (ourInstance == null){
//                ourInstance = new SingletonFullerSyn();
//                return ourInstance;
//            }
//            return ourInstance;
//        }
//    }

    /**
     * DLC
     * @return
     */
    public static SingletonFullerSyn getInstance() throws InterruptedException {
        if (ourInstance == null){
            synchronized (SingletonFullerSyn.class){
                if (ourInstance == null){
                    ourInstance = new SingletonFullerSyn();
                    return ourInstance;
                }
            }
        }
        return ourInstance;
    }

    private SingletonFullerSyn() throws InterruptedException {
        name = "hahaha";
        name = "123";
         //Thread.sleep(2000);
        //System.out.println("initialized !!!!");
    }
}
