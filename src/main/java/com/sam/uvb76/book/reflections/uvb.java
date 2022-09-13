package com.sam.uvb76.book.reflections;

import java.lang.annotation.*;

/**
 * @author sam
 */
@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface uvb {

    int id() default 1;

    String locaton() default "X17实验室";

}
