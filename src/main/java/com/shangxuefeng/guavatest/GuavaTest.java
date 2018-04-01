package com.shangxuefeng.guavatest;

import com.google.common.collect.Lists;

import java.util.List;

public class GuavaTest {
    public static void main(String[] args){
        List<String> list = Lists.newArrayList("kevin", "Tom");
        list.stream().forEach(System.out::println);
    }
}
