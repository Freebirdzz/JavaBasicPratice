package com.shangxuefeng.designpattern.proxy.cglib_dynamic;

import net.sf.cglib.proxy.Enhancer;

public class MyProxyFactory {
    public static UserServiceImpl getAuthInstance(){
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(new MyMethodInterceptor());
        UserServiceImpl userService = (UserServiceImpl)enhancer.create();
        return userService;
    }
}
