package com.shangxuefeng.functioninterface;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FiTest {

    public static int init(Supplier<Integer> supplier){
        return supplier.get();
    }



    public static void main(String[] args){
        int initValue = init(() -> 1024);
        System.out.println(initValue);

    }
}
