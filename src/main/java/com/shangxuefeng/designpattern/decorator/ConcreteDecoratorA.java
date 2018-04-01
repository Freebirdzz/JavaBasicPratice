package com.shangxuefeng.designpattern.decorator;

/**
 * @author shangxuefeng @date 2018/3/6
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void methodA(){
        System.out.println("被装饰器A扩展的功能");
    }


    @Override
    public void doSomething() {
        System.out.println("针对该方法加一层A包装");
        super.doSomething();
        System.out.println("A包装结束");
    }
}
