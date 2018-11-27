package com.sam.uvb76.book.annotation;

import com.sam.uvb76.book.service.Station;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LiYangpan on 2018/7/29  4:26 PM.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class TestMain {

    public static void main(String[] args) throws ClassNotFoundException{

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationApplication.xml");

        Station station = applicationContext.getBean("station", Station.class);

        System.out.println(station.getName());
        System.out.println(station.getRadio().getBrand());

    }
}
