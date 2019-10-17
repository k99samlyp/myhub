package com.sam.uvb76.book.serializable;

import java.io.*;

public class RadioEx implements Externalizable {

    private static final long serialVersionUID = -78L;

    private String weight;
    private String brand;
    private transient int port;

    public RadioEx(){
        this.brand = "test";
        this.weight = "98T";
        this.port = 9100;
    }

    public RadioEx(String weight, String brand, int port){
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


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeObject(weight);
        out.writeObject(brand);
        out.writeObject(port);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        weight = (String) in.readObject();
        brand = (String) in.readObject();
        port = (int) in.readObject();
    }
}
