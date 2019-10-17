package com.sam.uvb76.book.serializable;

import java.io.Serializable;

public class Radio implements Serializable {

    private static final long serialVersionUID = -75L;

    private String weight;
    private String brand;
    private transient int port;

    public Radio(){
        this.brand = "test";
        this.weight = "98T";
        this.port = 9800;
    }

    Radio(String weight, String brand){
        this.brand = brand;
        this.weight = weight;
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

//    public void setPort(int port) {
//        this.port = port;
//    }


    @Override
    public String toString() {
        return "Radio{" +
                "weight='" + weight + '\'' +
                ", brand='" + brand + '\'' +
                ", port=" + port +
                '}';
    }
}
