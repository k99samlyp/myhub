package com.sam.uvb76.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;


public class Station {

    private String name;

    //@Autowired
    @Inject
    private Radio radio;

    private Radio oldradio;

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

    public Radio getOldradio() {
        return oldradio;
    }


//    @Autowired
//    @Qualifier("oldradio")
    @Inject
    @Qualifier("oldradio")
    public void setOldradio(Radio oldradio) {
        this.oldradio = oldradio;
    }
}
