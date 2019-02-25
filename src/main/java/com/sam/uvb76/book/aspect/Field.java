package com.sam.uvb76.book.aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;

import javax.inject.Inject;
import javax.inject.Named;

public class Field {

    @Inject
    @Qualifier("old")
    @Lazy
    private BrainBurner brainBurner;

    public BrainBurner getBrainBurner() {
        return brainBurner;
    }

    public void prtCore(){
        System.out.println("hahah");
    }
}
