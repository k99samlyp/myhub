package com.sam.uvb76.book.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;

public class Field {

    @Inject
    @Named("old")
    private BrainBurner brainBurner;

    @Inject
    @Named("old")
    private BrainBurner brainBurner2;

    public BrainBurner getBrainBurner() {
        return brainBurner;
    }

    public void checkSame(){
        System.out.println(brainBurner == brainBurner2);
    }
}
