package com.sam.uvb76.book.proxy;

import java.lang.reflect.Proxy;

public class ProxyTester {

    public static void main(String[] args) {

        Radio radio = (Radio) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{Radio.class}, new ProxyHandler(new RadioImpl()));

        radio.sendMessage();
    }
}
