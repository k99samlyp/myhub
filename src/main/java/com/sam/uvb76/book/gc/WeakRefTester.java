package com.sam.uvb76.book.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.WeakReference;

/**
 * Created by LiYangpan on 2018/7/29  4:26 PM.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class WeakRefTester {

//    static class Game extends WeakReference<String>{
//
//        public Game(String referent) {
//            super(referent);
//        }
//    }




    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {

        String name = "333";
//        String name = new String("333");

//        Game weakref = new Game(name);

        WeakReference<Object> w2 = new WeakReference<>(name);

//        System.out.println(weakref.get());

        name = null;

        System.gc();

//        Thread.sleep(2000);

        System.out.println("弱引用:" + (w2.get() == null));

        synchronized (WeakRefTester.class){
            WeakRefTester.class.wait();
        }
    }

}
