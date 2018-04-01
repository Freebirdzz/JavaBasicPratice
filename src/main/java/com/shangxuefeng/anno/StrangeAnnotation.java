package com.shangxuefeng.anno;

import javax.annotation.PostConstruct;

class Tc{
    private String name;
    private int age;

    public Tc(String name, int age){
        System.out.println("--- Constructor ---");
        this.name = name;
        this.age = age;
    }


    @PostConstruct
    public void init(){
        System.out.println("---------- init method after constructor ----------");
    }
}
public class StrangeAnnotation {
    public static void main(String[] args){
        Tc tt = new Tc("Kevin", 27);
    }
}
