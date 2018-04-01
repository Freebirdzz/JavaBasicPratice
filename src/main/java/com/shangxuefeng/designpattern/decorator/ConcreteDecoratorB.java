package com.shangxuefeng.designpattern.decorator;

/**
 * @author shangxuefeng @date 2018/3/6
 */
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void methodB(){
        System.out.println("被装饰器B扩展的功能");
    }

    @Override
    public void doSomething(){
        System.out.println("针对该方法加一层B包装");
        super.doSomething();
        System.out.println("B包装结束");
    }
}
