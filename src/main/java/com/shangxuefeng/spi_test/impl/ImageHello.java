package com.shangxuefeng.spi_test.impl;

import com.shangxuefeng.spi_test.HelloInterface;

public class ImageHello implements HelloInterface{
    @Override
    public void sayHello(){
        System.out.println("ImageHello");
    }
}
