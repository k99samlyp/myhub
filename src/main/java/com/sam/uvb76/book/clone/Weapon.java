package com.sam.uvb76.book.clone;

import com.sam.uvb76.book.aspect.Radio;

import javax.inject.Inject;

public class Weapon implements Cloneable {

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
