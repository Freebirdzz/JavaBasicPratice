package com.shangxuefeng.clone;

import lombok.Getter;
import lombok.Setter;

/**
 * @author shangxuefeng @date 2018/3/12
 */
@Setter
@Getter
public class TBean implements Cloneable{
    private String name;


    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("----- TBean重写了clone方法 -----");
        return super.clone();
    }

    public TBean(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "TBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
