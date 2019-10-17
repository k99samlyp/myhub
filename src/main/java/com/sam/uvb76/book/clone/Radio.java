package com.sam.uvb76.book.clone;

import java.io.Serializable;

public class Radio implements Cloneable {

    private static final long serialVersionUID = -75L;

    private String weight;
    private String brand;
    private int port;

    private BrainBurner brainBurner;

    public Radio(){
        this.brand = "test";
        this.weight = "98T";
        this.port = 9800;
        this.brainBurner = new BrainBurner();
    }

    Radio(String weight, String brand, int port){
        this.brand = brand;
        this.weight = weight;
        this.port = port;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public BrainBurner getBrainBurner() {
        return brainBurner;
    }

    public void setBrainBurner(BrainBurner brainBurner) {
        this.brainBurner = brainBurner;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "weight='" + weight + '\'' +
                ", brand='" + brand + '\'' +
                ", port=" + port +
                ", brainBurner=" + brainBurner.getName() +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Radio o = (Radio) super.clone();
        o.setBrainBurner((BrainBurner) brainBurner.clone());

        return o;
    }
}
