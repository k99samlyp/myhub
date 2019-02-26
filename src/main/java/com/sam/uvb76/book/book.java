package com.sam.uvb76.book;

import com.sam.uvb76.book.service.Radio;
import com.sam.uvb76.book.service.Station;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LiYangpan on 2018/7/29  4:26 PM.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class book {

    public static void main(String[] args) throws ClassNotFoundException{

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("base.xml");

        //Radio radio1 = applicationContext.getBean("radio", Radio.class);
//        Radio radio2 = applicationContext.getBean("radio", Radio.class);

        Station station = applicationContext.getBean("station", Station.class);


        //System.out.println(radio1 == radio2);
        System.out.println(station.getName());
        System.out.println(station.getRadio().getBrand());
        System.out.println(station.getOldradio().getWeight());

    }
}
