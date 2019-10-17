package com.sam.uvb76.book.clone;

import com.sam.uvb76.book.aspect.Radio;

import javax.inject.Inject;

public class BrainBurner implements Cloneable {

    private String name;

    public BrainBurner(String name) {
        this.name = name;
    }

    public BrainBurner() {
        this.name = "X16";
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
