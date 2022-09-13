package com.sam.uvb76.book.serializable;

import java.io.Serializable;

public class Player implements Serializable {

    private static final long serialVersionUID = -75L;

    private transient String name;
    private int level;
    private Weapon weapon;

    private static int itemConut = 99;

    public Player(){
        name = "sam";
        level = 10;
        weapon = new Weapon();
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", weapon=" + weapon +
                '}';
    }
}
