package com.shangxuefeng.serizlizable_test;

import lombok.AllArgsConstructor;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 实现Serizlizable接口的测试类
 *
 * @author kevin
 */
@AllArgsConstructor
public class Student implements Serializable {
    /**
     * 通过transient阻止字段被序列化
     */
    transient private String name;
    private Integer age;
    private String addr;
    private boolean gender;

    public Student() {
        name = "Default name";
        age = 34;
        addr = "Huhhot";
        gender = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + ", addr=" + addr + "]";
    }


}
