package com.sam.uvb76.book.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by LiYangpan on 2018/7/29  4:26 PM.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class TestMain {

    public static void main(String[] args) throws ClassNotFoundException{

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(UvbConfig.class);

        Field field = applicationContext.getBean(Field.class);

        System.out.println(field.getBrainBurner().getTowerCount());

        field.prtCore();
    }
}
