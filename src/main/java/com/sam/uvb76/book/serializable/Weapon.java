package com.sam.uvb76.book.serializable;

import java.io.Serializable;

public class Weapon implements Serializable{

    private static final long serialVersionUID = -89812L;


    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    public Weapon() {
        this.name = "AK74";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
