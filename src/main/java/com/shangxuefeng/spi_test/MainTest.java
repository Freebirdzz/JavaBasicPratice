package com.shangxuefeng.spi_test;

import java.util.ServiceLoader;

public class MainTest {
    public static void main(String[] args){
        ServiceLoader<HelloInterface> loaders = ServiceLoader.load(HelloInterface.class);
        for (HelloInterface hi : loaders){
            hi.sayHello();
        }

    }
}
