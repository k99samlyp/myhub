package com.sam.uvb76.book.aspect;

import javax.inject.Inject;

public class BrainBurner {

    private String name;

    private int towerCount;

    @Inject
    private Radio radio;

    BrainBurner(){
        this.name = "222";
        this.towerCount = 5;
    }

    BrainBurner(String name, int towerCount){
        this.name = name;
        this.towerCount = towerCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTowerCount() {
        return towerCount;
    }

    public void setTowerCount(int towerCount) {
        this.towerCount = towerCount;
    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }
}
