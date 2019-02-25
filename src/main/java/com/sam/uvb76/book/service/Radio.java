package com.sam.uvb76.book.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import java.beans.ConstructorProperties;


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

    public static Radio getNewRadio(){
        return new Radio("98T","X18");
    }

    public static Radio getOldRadio(){
        return new Radio("90T","X17");
    }
}
