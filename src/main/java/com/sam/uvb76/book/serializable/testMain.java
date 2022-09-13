package com.sam.uvb76.book.serializable;

import java.io.*;

public class testMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        File of = new File("/Users/sam/ooof");

        /**
         *  Serializable 开始
         */

        Player r1 = new Player();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(of));

        oos.writeObject(r1);

        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(of));

        Player afterRead = (Player) ois.readObject();

        ois.close();

        System.out.println(afterRead);

        System.out.println("------------------------------------------------------");

        /**
         *  Serializable  结束
         */

//        PlayerEx r1e = new PlayerEx("2222");
//
//        oos = new ObjectOutputStream(new FileOutputStream(of));
//
//        oos.writeObject(r1e);
//
//        oos.close();
//
//
//
//        ois = new ObjectInputStream(new FileInputStream(of));
//
//        PlayerEx afterReadEx = (PlayerEx) ois.readObject();
//
//        System.out.println(afterReadEx);
//
//        ois.close();

    }



}
