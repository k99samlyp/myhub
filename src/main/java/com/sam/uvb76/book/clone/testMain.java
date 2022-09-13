package com.sam.uvb76.book.clone;

public class testMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        Player r1 = new Player();
//        Player r2 = r1;
        Player r2 = (Player) r1.clone();

        r1.setName("tom");
        r1.setLevel(20);
        r1.getWeapon().setName("HK416");

        System.out.println(r2);

    }



}
