package com.shangxuefeng.designpattern.proxy.cglib_dynamic;

public class MainTest {
    public static void main(String[] args){
        UserServiceImpl userService = MyProxyFactory.getAuthInstance();

        userService.add();
    }
}
