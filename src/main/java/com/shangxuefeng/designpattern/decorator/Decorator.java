package com.shangxuefeng.designpattern.decorator;

/**
 * @author shangxuefeng @date 2018/3/6
 */
public class Decorator implements Component{

    public Decorator(Component component) {
        super();
        this.component = component;
    }

    protected Component component;
    @Override
    public void doSomething() {
        component.doSomething();
    }
}
