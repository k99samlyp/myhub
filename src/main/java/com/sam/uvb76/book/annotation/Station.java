package com.sam.uvb76.book.annotation;

public class Station {

    private String name;

    private Radio radio;

    Station(){

    }

    Station(String name, Radio radio){
        this.name = name;
        this.radio = radio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }
}
