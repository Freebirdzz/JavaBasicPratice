package com.shangxuefeng.lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Predicate就是一个函数接口，具体的细节不清楚，但是作用都是
 * 1、传递一个入参，泛型<T>类型
 * 2、执行test函数判断T是否满足某些规则（具体的规则由实现提供，Predicate只提供接口，不实现）
 * 3、返回boolean的判断执行结果
 *
 * MyPredicate相当于定义了一个类别的函数（和C中的函数指针非常像）
 */
class MyPredicate implements Predicate<Student>{
    @Override
    public boolean test(Student student) {
        return student.getAge() > 18;
    }
}

/**
 * Consumer定义了另一个类别的函数，这个类别的函数特点是
 * 1、对泛型入参T进行一些操作或者运算
 * 2、没有返回值
 */
class MyConsumer implements Consumer<Student>{

    @Override
    public void accept(Student student) {
        student.setDesc(Phase.ADULT);
    }
}

enum Phase {
    CHILD(1, "Stupid child"),
        YOUNG(2, "Arragent young"),
        ADULT(3, "Foolish ADULT"),
        OLD(4, "Poor old man");

    Phase(int code, String description){
        this.code = code;
        this.descriptioin = description;
    }
    private int code;
    private String descriptioin;
}


@Setter
@Getter
@AllArgsConstructor
public class Student {
    private String name;
    private String addr;
    private int age;
    private boolean gender;
    private Phase desc;




    public static  Student updateStudentFee(Student student, Predicate<Student> predicate, Consumer<Student> consumer){
        if (predicate.test(student)){
            consumer.accept(student);
        }
        return student;
    }

    public String toString(){
        return "[" + name + ", " + addr + ", " + age + ", " + desc.name() + "]";
    }


    public static void main(String[] args){
        Student stu = new Student("Kevin", "Huhhot", 19, true, Phase.CHILD);
        System.out.println(stu);

        updateStudentFee(stu, new MyPredicate(), new MyConsumer());

        System.out.println(stu);


        /**
         * lambda写法
         */

        updateStudentFee(stu, (student)-> student.getAge() > 18, (student)-> student.setDesc(Phase.ADULT));
    }
}
