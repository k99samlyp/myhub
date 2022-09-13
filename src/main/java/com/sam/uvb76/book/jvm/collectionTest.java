package com.sam.uvb76.book.jvm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collectionTest {

    public final static int book = 90;

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {

        String s1 = new String("1") + new String("1");
        s1.intern();
        String s2 = "11";

//        String s1 = "1" + "1";
////        s1.intern();
//        String s2 = "11";
//
//        String s1 = new String("11");
//        s1.intern();
//        String s2 = "11";

//        String s1 = "11";
//        s1.intern();
//        String s2 = "1" + "1";
//        System.out.println(s1 == s2);

//        String s1 = new String("11");
//        String s2 = s1.intern();
//        String s3 = "11";
//        System.out.println(s3 == s2);

        synchronized (collectionTest.class){
            collectionTest.class.wait();
        }


    }




}
