package com.shangxuefeng.serizlizable_test;

import lombok.AllArgsConstructor;

import java.io.*;

/**
 * 实现Serizlizable接口的测试类
 *
 * @author kevin
 */
@AllArgsConstructor
public class StudentV3 implements Externalizable {
    /**
     * 通过transient阻止字段被序列化
     */
    private String name;
    private Integer age;
    private String addr;
    private boolean gender;

    public StudentV3() {
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


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(addr);
        out.writeInt(age);
        out.writeBoolean(gender);
        System.out.println("Externalizable接口，实现writeExternal");

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Externalizable接口，实现readExternal");
        name = (String) in.readObject();
        addr = (String) in.readObject();
        age = (int)in.readInt();
        gender = (boolean)in.readBoolean();

    }
}
