package com.sam.uvb76.book.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiYangpan on 2019-03-13  15:41.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class Stoper {

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {

//        byte[] aaa = new byte[1 * 1024 * 1024];
//
//        String bbb = "haha";
//
//        List<String> nnn = new ArrayList<>();
//
//        int i = 100000;
//
//        while (true){
//            //String.valueOf(i).intern();
//            String bbb2 = new String(String.valueOf(i));
//            nnn.add(bbb2.intern());
//        }

        System.out.println("跳出1111");

        retry:
        for (;;) {
//            int wc = workerCountOf(c);
//            if (wc >= CAPACITY ||
//                    wc >= (core ? corePoolSize : maximumPoolSize))
//                return false;
//            if (compareAndIncrementWorkerCount(c))
//                break retry;
//            c = ctl.get();  // Re-read ctl
//            if (runStateOf(c) != rs)
//                continue retry;
//            // else CAS failed due to workerCount change; retry inner loop

            break retry;
//            continue retry;
        }

        System.out.println("跳出");

    }

}
