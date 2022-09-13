package com.sam.uvb76.book.reflections;

/**
 * @author sam
 */
abstract class Radio {

    public static int SUPERID = 10000;


    public void makeRadio(){
        System.out.println("print from makeRadio in Radio");
    }

    static {
        System.out.println("Radio 初始化");
    }


}
