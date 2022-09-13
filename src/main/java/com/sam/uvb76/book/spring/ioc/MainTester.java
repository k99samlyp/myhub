package com.sam.uvb76.book.spring.ioc;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

public class MainTester {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplication.xml");

        RadioBean ra1983 = context.getBean("radio",RadioBean.class);

        System.out.println("aaaaa");

//        context.refresh();
    }

}
