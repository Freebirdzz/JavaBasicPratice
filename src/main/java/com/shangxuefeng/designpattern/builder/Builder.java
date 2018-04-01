package com.shangxuefeng.designpattern.builder;

import java.util.function.BiFunction;

/**
 * 来自wiki的java版本 Builder Pattern
 * @param <T>
 */
public class Builder<T> {
    private final BiFunction<Integer, String, T> builder;

    private int wheelsOrZero;
    private String colorOrNull;

    Builder(final BiFunction<Integer, String, T> builder){
        this.builder = builder;
    }

    public T build(){
        return builder.apply(wheelsOrZero, colorOrNull);
    }

    public Builder<T> setWheels(final int wheels){
        wheelsOrZero = wheels;
        return this;
    }

    public Builder<T> setColor(final String color){
        colorOrNull = color;
        return this;
    }

}
