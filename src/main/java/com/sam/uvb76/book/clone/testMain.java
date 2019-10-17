package com.sam.uvb76.book.clone;

import com.sam.uvb76.book.serializable.RadioEx;

import java.io.*;

public class testMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        Radio r1 = new Radio();

        Radio r2 = (Radio) r1.clone();


        System.out.println(r2);

        r1.setWeight("33T");
        r1.getBrainBurner().setName("X18");

        System.out.println(r2);

        //Radio r3 = new Radio("111","eeee",8980);

        int a = 1 + 3 >> 1;

        System.out.println(a);


    }



}
