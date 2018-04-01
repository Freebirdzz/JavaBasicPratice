package com.shangxuefeng.spi_test;


import org.junit.Test;

import java.util.ServiceLoader;

public class MainTest {
    @Test
    public void tc(){
        ServiceLoader<HelloInterface> loaders = ServiceLoader.load(HelloInterface.class);
        for (HelloInterface hi : loaders){
            hi.sayHello();
        }

    }



}
