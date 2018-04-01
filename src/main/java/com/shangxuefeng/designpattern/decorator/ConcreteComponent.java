package com.shangxuefeng.designpattern.decorator;

/**
 * @author shangxuefeng @date 2018/3/6
 */
public class ConcreteComponent implements Component{
    @Override
    public void doSomething() {
        System.out.println("被装饰的原始类-doSomething方法");
    }
}
