package com.shangxuefeng.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class TLambda {

    public static void t1(){
        // 不使用lambda表达式为每个订单加上12%的税
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for (Integer cost : costBeforeTax) {
            double price = cost + .12*cost;
            System.out.println(price);
        }
        System.out.println("-------------------------");
        // 使用lambda表达式
        costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        costBeforeTax.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);
    }


    public static void testLambdaMap(){
        Map<Long, Boolean> map = new HashMap<Long, Boolean>();
        map.put(1000L, true);
        map.put(2000L, false);
        map.put(3000L, true);
        map.put(4000L, false);
        map.put(5000L, true);

        List<Long> list = map.entrySet().stream().filter(p -> p.getValue().equals((Boolean.TRUE))).map(Map.Entry::getKey).collect(Collectors.toList());
        list.stream().forEach(System.out::println);
    }



    public static void main(String[] args){
        testLambdaMap();
    }
}
