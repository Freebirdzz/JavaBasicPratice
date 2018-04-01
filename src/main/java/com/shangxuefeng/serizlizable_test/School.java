package com.shangxuefeng.serizlizable_test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author shangxuefeng @date 2018/3/9
 */
@Getter
@Setter
public class School {
    private String name = null;
    private String id = null;

    public School(){
        this.name = "default_school_name";
        this.id = "default_school_id";
    }
    public School(String name, String id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
