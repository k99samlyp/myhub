package com.sam.uvb76.book.annotation;

public class Radio {

    private String weight;

    private String brand;

    private Radio(String weight, String brand){
        this.brand = brand;
        this.weight = weight;
    }

    {
        System.out.println("this is from inner block!!!");
    }

    public static Radio getInstance(String weight, String brand){
        System.out.println("this is from constractor");

        return new Radio(weight, brand);
    }


    static {
        System.out.println("this is from static block!!!");
    }

    public String getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }
}
