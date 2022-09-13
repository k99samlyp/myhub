package com.sam.uvb76.book.ExceptionHandle;

import java.io.IOException;

public class MainTester {

    public static void main(String[] args) {
        System.out.println("前面运行");

        System.out.println("111" + getName());


//        try {
//            System.out.println("111" + getName1());
//        }
//        catch (Exception ignored){
//            System.out.println("main 出错");
//            ignored.printStackTrace();
//        }
//
//        System.out.println("后面运行");
//        System.out.println("后面运行2");


    }


    public static String getName(){

         String a = "sam,toy";
        a = null;
        try {
//            a.indexOf("sam");
//            throw new NullPointerException("e1");
            return "OK";
        }
        catch (Exception e){
            System.out.println("getName 出错");
//            e.printStackTrace();
            System.out.println("yyy" + e.getMessage());
        }
        finally {
            try {
                a.indexOf("sam");
            }
            catch (Exception e){
                System.out.println("getName-finally 出错");
//                throw new NullPointerException();
            }
        }
        return "rrrr";
    }

    public static String getName1() throws NullPointerException,ClassCastException {
        String a = "sam,toy";
        a = null;
        a.indexOf("sam");
        return "OK";
    }
}
