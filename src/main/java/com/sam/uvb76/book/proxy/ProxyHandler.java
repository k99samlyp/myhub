package com.sam.uvb76.book.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

    Object item;

    ProxyHandler(Object object){
        item = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("1111111");
        Object oo = method.invoke(item, args);
        System.out.println("2222");

        return oo;
    }
}
