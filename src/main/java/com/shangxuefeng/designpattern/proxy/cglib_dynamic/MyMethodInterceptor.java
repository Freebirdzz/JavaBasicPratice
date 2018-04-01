package com.shangxuefeng.designpattern.proxy.cglib_dynamic;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author kevin
 */
public class MyMethodInterceptor implements MethodInterceptor {
    /**
     *
     * @param o：代理对象
     * @param method：委托类方法
     * @param objects：方法参数
     * @param methodProxy：代理方法的MethodProxy对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before: " + method);
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("After: " + method);
        return object;
    }
}
