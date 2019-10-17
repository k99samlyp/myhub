package com.sam.uvb76.book.jvm;

import java.util.zip.Adler32;

public class a {

    public final static int book = 90;

    public static void main(String[] args) throws ClassNotFoundException {
        String name = "a";

        String name1 = new String("b");

//        add();

//        aaa();

        selfadd();



    }


    public static void add(){

        int a = 1;
        int b = 1;
        int c = a + b;

        aaa();

    }

    public static void selfadd(){

        int a = 1;

        a = a++;

        int b = 100;

        b=++b;



    }

    public static void aaa(){


        System.out.println("sdadadd");


    }


}
