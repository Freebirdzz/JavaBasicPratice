package com.shangxuefeng.serizlizable_test;

import lombok.AllArgsConstructor;

import java.io.*;

/**
 * 实现Serizlizable接口的测试类
 *
 * @author kevin
 */
public class StudentV2 implements Serializable {

    /**
     * 定义不同版本的兼容
     */
    private static final long serialVersionUID = 1L;
    /**
     * 通过transient阻止字段被序列化
     */
    private String name;
    private Integer age;
    private String addr;
    private boolean gender;

    private transient School school;


    public String phone;
    public int card;

    public StudentV2() {
        name = "Default name";
        age = 34;
        addr = "Huhhot";
        gender = false;
        school = new School();
    }

    public StudentV2(String name, Integer age, String addr, boolean gender) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.gender = gender;
        school = new School(name + "-School", name + "-id");
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
        return "StudentV2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", gender=" + gender +
                ", school=" + school +
                ", phone='" + phone + '\'' +
                ", card=" + card +
                '}';
    }

    /**
     * 自定义序列化
     * @param out
     * @throws IOException
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        //invoke default serialization method
        out.defaultWriteObject();

        if(school == null) {
            school = new School();
        }
        out.writeObject(school.getName());
        out.writeObject(school.getId());
        System.out.println("---------- 自定义序列化writeObject执行完成 ---------");
    }

    /**
     * 自定义反序列化
     * @param in
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        //invoke default serialization method
        in.defaultReadObject();

        String name = (String) in.readObject();
        String id = (String) in.readObject();
        school = new School(name, id);
        System.out.println("---------- 自定义序列化readObject执行完成 ---------");

    }
}
