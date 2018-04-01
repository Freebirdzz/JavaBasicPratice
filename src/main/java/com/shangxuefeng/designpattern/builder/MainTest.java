package com.shangxuefeng.designpattern.builder;

public class MainTest {
    public static void main(String[] args){
        User user = new
                User.UserBuilder("Jhon", "Doe")
                .age(30)
                .phone("1234567")
                .address("Fake address 1234")
                .build();

    }
}
