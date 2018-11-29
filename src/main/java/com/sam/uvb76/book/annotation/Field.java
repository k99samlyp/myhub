package com.sam.uvb76.book.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;

public class Field {

    @Inject
    @Qualifier("new")
    private BrainBurner brainBurner;

    public BrainBurner getBrainBurner() {
        return brainBurner;
    }
}
