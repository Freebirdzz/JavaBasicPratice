package com.shangxuefeng.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Tc{
    public boolean isMatch(int n){
        return (n % 2) == 0 ? true : false;
    }


    public void testStream(){
        List<String> list = Arrays.asList("Kevin", "Tom", "Lucy", "Abc", "Kobe", "Beatles", "Zeppelin", "Pink Floyd");
        List<Integer> it = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> li = it.stream().filter(tmp -> {boolean ret = isMatch(tmp) || tmp == 1 || tmp == 9;return ret;}).collect(Collectors.toList());
        System.out.println(li);

    }
}
public class TestStream {
    public static void main(String[] args){
        Tc test = new Tc();
        test.testStream();
    }
}
