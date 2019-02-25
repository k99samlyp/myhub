package com.sam.uvb76.book.aspect;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import javax.inject.Named;

@Configuration
@ComponentScan("com.sam.uvb76.book.aspect")
@EnableAspectJAutoProxy
public class UvbConfig {

    @Bean
    @Primary
    @Qualifier("old")
    @Scope("singleton")
    public BrainBurner getNewBrainBurner(){
        return new BrainBurner();
    }

    @Bean
    @Named("new")
    public BrainBurner getNew2BrainBurner(){
        return new BrainBurner("cnb",8);
    }

    @Bean
    public Field getField(){
        return new Field();
    }


}
