package com.sam.uvb76.book.reflections;

import com.google.common.base.Predicate;
import com.sam.uvb76.book.cas.DataCheckUtils;
import org.reflections.Reflections;
import org.reflections.scanners.FieldAnnotationsScanner;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Set;

/**
 * @author sam
 */
public class mainTester {

    private static Logger log = LoggerFactory.getLogger(DataCheckUtils.class);


    public static void main(String[] args) throws ClassNotFoundException {

        FilterBuilder filterBuilder = new FilterBuilder().includePackage("com.uvb76.book.reflections");


        Predicate<String> filter = filterBuilder;

        Reflections reflections = new Reflections(new ConfigurationBuilder().forPackages("com.uvb76.book.reflections")
                .addScanners(new FieldAnnotationsScanner())
        );


        Set<Field> res = reflections.getFieldsAnnotatedWith(uvb.class);

//        reflections.getFieldsAnnotatedWith();

        log.info(String.valueOf(res.size()));

    }
}
