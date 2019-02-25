package com.sam.uvb76.book.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import javax.inject.Named;

@Configuration
@ComponentScan("com.sam.uvb76.book.annotation")
public class UvbConfig {

    @Bean
    @Primary
    @Named("old")
//    @Scope("singleton")
    public BrainBurner getNewBrainBurner(){
        return new BrainBurner();
    }

    @Bean
    @Named("new")
    @Scope("prototype")
    public BrainBurner getNew2BrainBurner(){
        return new BrainBurner("cnb",8);
    }

    @Bean
    public Field getField(){
        return new Field();
    }


}
