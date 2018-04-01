package com.shangxuefeng.enumtest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
enum Type{
    RUN(1, "I am running"), WALK(2, "Nobady walking"), SWIM(3, "CAN YOU?");

    Type(int code, String desc){
        this.code = code;
        this.desc = desc;
    }



    private Integer code;
    private String desc;
}

@Getter
@Setter
@AllArgsConstructor
class Student{
    private String name;
    private int age;
    private Type action;

    public void printInfo(){
        System.out.println("My name is: " + name + ", " + age +" years old(ACTION= " + action.getDesc() + ")");
    }
}
public class EnumTest {
    public static void main(String[] args){
        Student stu = new Student("Kevin", 27, Type.RUN);
        for (int i=0;i<Type.values().length;i++)
            System.out.println(Type.values()[i]);

        int a = 0;
        boolean b = (a != 0);
        System.out.println(b);

        String str = "    ";
        System.out.println(str.trim() == "");
    }
}
