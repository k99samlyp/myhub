package com.sam.uvb76.book.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

public class Field {

    @Inject
    @Named("new")
    @Lazy
    private BrainBurner brainBurner;

    public BrainBurner getBrainBurner() {
        return brainBurner;
    }
}
