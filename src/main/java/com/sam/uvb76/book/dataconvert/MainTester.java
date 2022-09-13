package com.sam.uvb76.book.dataconvert;

import java.io.IOException;

public class MainTester {

    public static void main(String[] args) {

        String name = "9800";
        String name2 = "9999";

        Object pointer = name;

        Avs36 newGun = new Avs36();

        Weapon superGun = new Weapon();

        System.out.println(pointer instanceof String);
        System.out.println(name.getClass().isAssignableFrom(name2.getClass()));
        
        System.out.println(superGun.getClass().isAssignableFrom(newGun.getClass()));
        System.out.println(Fire.class.isAssignableFrom(newGun.getClass()));


    }

}
