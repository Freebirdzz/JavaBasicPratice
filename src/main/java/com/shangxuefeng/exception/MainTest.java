package com.shangxuefeng.exception;

/**
 * @author shangxuefeng @date 2018/3/29
 */
public class MainTest {
    public String t1(int a){
        if (a == 1){
            throw new MyException("MyException");
        } else{
            return "Hello World";
        }
    }

    public void test() {
        try {
            System.out.println("Start");

            System.out.println("Result=" + t1(1));


        } catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("end");
    }

    public static void main(String[] args){

            new MainTest().test();

    }

}
