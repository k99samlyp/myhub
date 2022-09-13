package com.sam.uvb76.book.juc.singleton;

/**
 * 单例工厂
 */
public class SingletonFooFactory {

    /**
     * 构造方法私有化，防止外部调用直接new
     */
    private SingletonFooFactory(){
//        System.out.println(Thread.currentThread().getId() + "-构造");
    }

//    /**
//     * 饿汉模式
//     */
//    private final static SingletonFooFactory singletonFoo = new SingletonFooFactory();
//
//    public static SingletonFooFactory getSingletonFoo() {
//        return singletonFoo;
//    }

//    /**
//     * 饿汉模式  用static块实例化  类加载时只执行1次
//     */
//    private final static SingletonFooFactory singletonFoo;
//
//    static {
//        singletonFoo = new SingletonFooFactory();
//    }
//
//    public static SingletonFooFactory getSingletonFoo() {
//        return singletonFoo;
//    }

//    /**
//     * 懒汉模式 lazy加载 线程不安全
//     */
//    private static SingletonFooFactory singletonFoo;
//
//    public static SingletonFooFactory getSingletonFoo() {
//        if (singletonFoo == null){
//            singletonFoo = new SingletonFooFactory();
//        }
//        return singletonFoo;
//    }

//    /**
//     * 懒汉模式 lazy加载-synchronized修饰get方法 线程安全
//     */
//    private static SingletonFooFactory singletonFoo;
//
//    public static synchronized SingletonFooFactory getSingletonFoo() {
//        if (singletonFoo == null){
//            singletonFoo = new SingletonFooFactory();
//        }
//        return singletonFoo;
//    }

//    /**
//     * 懒汉模式 lazy加载-synchronized代码块 线程安全
//     */
//    private static SingletonFooFactory singletonFoo;
//
//    public static SingletonFooFactory getSingletonFoo() {
//
//        synchronized (SingletonFooFactory.class){
//            System.out.println("进入同步块");
//            if (singletonFoo == null){
//                singletonFoo = new SingletonFooFactory();
//            }
//        }
//        return singletonFoo;
//    }


    /**
     * 懒汉模式 DCL 线程安全
     */
    private volatile static SingletonFooFactory singletonFoo;

    public static SingletonFooFactory getSingletonFoo() throws InterruptedException {

        if (singletonFoo == null){
            System.out.println("进入if");
            synchronized (SingletonFooFactory.class){
                System.out.println(Thread.currentThread().getId() + "-进入synchronized");
                if (singletonFoo == null){
                    System.out.println(Thread.currentThread().getId() + "-进入2-if");
                    singletonFoo = new SingletonFooFactory();
//                    Thread.sleep(5000);
                }
            }
        }
        return singletonFoo;
    }

//    /**
//     * 静态内部类 线程安全
//     */
//
//    private final static class singletonFooHolder {
//
//        private static SingletonFooFactory singletonFoo = new SingletonFooFactory();
//
//        public static SingletonFooFactory getSingletonFoo() {
//            return singletonFoo;
//        }
//    }
//
//    public static SingletonFooFactory getSingletonFoo() {
//        return SingletonFooFactory.singletonFooHolder.getSingletonFoo();
//    }

}
