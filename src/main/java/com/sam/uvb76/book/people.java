package com.sam.uvb76.book;

/**
 * Created by LiYangpan on 2018/7/29  4:26 PM.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class people {

    String name;

    int age;

    String ooo;

    int temp;

    int tempclass;

    static {
        System.out.println("what ? static!");
    }


    public static void main(String[] args) throws ClassNotFoundException{

       // ClassLoader cl = ClassLoader.getSystemClassLoader();

        //cl.getParent().loadClass("com.sam.uvb76.book.Svt");
       // System.out.println(cl.getParent().getParent());
        //System.out.println(cl.getParent());

        //System.out.println(cl);

        //Class.forName("com.sam.uvb76.book.Svt");


        //Svt s1 = new Svt();


        String aaa = "123";

        int bbb = Integer.parseInt(aaa);

        System.out.println(bbb);




    }
}
