package com.shangxuefeng.designpattern.decorator;

/**
 * @author shangxuefeng @date 2018/3/6
 */
public class MainTest {
    public static void main(String[] args){
        Component component =new ConcreteComponent();//原来的对象
        System.out.println("------------------------------");
        component.doSomething();//原来的方法
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);//装饰成A
        System.out.println("------------------------------");
        concreteDecoratorA.doSomething();//原来的方法
        concreteDecoratorA.methodA();//装饰成A以后新增的方法
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);//装饰成B
        System.out.println("------------------------------");
        concreteDecoratorB.doSomething();//原来的方法
        concreteDecoratorB.methodB();//装饰成B以后新增的方法
        concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);//装饰成A以后再装饰成B
        System.out.println("------------------------------");
        concreteDecoratorB.doSomething();//原来的方法
        concreteDecoratorB.methodB();//装饰成B以后新增的方法
    }
}
