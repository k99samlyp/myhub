package com.sam.uvb76.book.serializable;

import java.io.Serializable;

public class WeaponEx implements Serializable {

    private static final long serialVersionUID = -89812L;


    private String name;

    public WeaponEx(String name) {
        this.name = name;
    }

    public WeaponEx() {
        this.name = "AK74";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
