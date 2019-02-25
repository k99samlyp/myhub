package com.sam.uvb76.book.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {


    @Before("execution(* com.sam.uvb76.book.aspect.Field.prtCore(..))")
    public void addSomeThing(){
        System.out.println("add!!!");
    }
}
