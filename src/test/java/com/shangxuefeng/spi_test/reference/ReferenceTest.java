package com.shangxuefeng.spi_test.reference;

import org.junit.Test;

/**
 * @author shangxuefeng @date 2018/3/14
 */
public class ReferenceTest {
    @Test
    public void arrayReference(){
        String[] strings = {"one", "two", "Three", "four", "five", "six"};
        final String[] tmp = strings;
        strings[3] = "hello";
        for(String str : tmp){
            System.out.println(str);
        }
    }


}
