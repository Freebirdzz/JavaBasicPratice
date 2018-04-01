package com.shangxuefeng.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * @author shangxuefeng @date 2018/3/8
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
public class Student implements Cloneable{
    private int id;
    private String name;
    private String addr;
    private boolean gender;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
