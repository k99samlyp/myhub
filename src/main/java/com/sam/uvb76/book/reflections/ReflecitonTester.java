package com.sam.uvb76.book.reflections;

import com.sam.uvb76.book.cas.DataCheckUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author sam
 */
public class ReflecitonTester {

    private static Logger log = LoggerFactory.getLogger(DataCheckUtils.class);


    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class clazz = ClassLoader.getSystemClassLoader().loadClass("com.sam.uvb76.book.reflections.Entity");

        Class clazz2 = Class.forName("com.sam.uvb76.book.reflections.Entity",false,Thread.currentThread().getContextClassLoader());

        Constructor[] cons = clazz.getDeclaredConstructors();
        Constructor[] con1s = clazz.getConstructors();

        Entity e1 = (Entity) cons[0].newInstance();

        Field field =  clazz.getField("age");

        Field[] fields = clazz.getDeclaredFields();

//        int y = Entity.SUPERID;

        Entity [] aaa = new Entity[90];

        uvb u1 = clazz.getField("age").getAnnotation(uvb.class);


        log.info("haha");


        clazz.newInstance();





    }
}
