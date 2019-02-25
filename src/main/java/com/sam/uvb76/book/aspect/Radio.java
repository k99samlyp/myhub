package com.sam.uvb76.book.aspect;

import org.springframework.stereotype.Component;

@Component
public class Radio {

    private String weight;

    private String brand;

    private Radio(){
        this.brand = "test";
        this.weight = "98T";
    }

    private Radio(String weight, String brand){
        this.brand = brand;
        this.weight = weight;
    }

    {
        System.out.println("this is from inner block!!!");
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
