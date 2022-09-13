package com.sam.uvb76.book.spring.ioc;

public class RadioBean {

    private RadioBean(){

    }

    private String name;

    private int damagePoint;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamagePoint() {
        return damagePoint;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }
}
