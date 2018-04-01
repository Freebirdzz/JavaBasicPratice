package com.shangxuefeng.object;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author shangxuefeng @date 2018/3/8
 */

public class MainTest {
    public static void main(String[] args){
        Student s1 = new Student(1, "Kevin", "Beijing", false);
        Student s2 = new Student(1, "Kevin", "Beijing", false);
        List<Student> list = Lists.newArrayList();
        System.out.println((s1 == s2) +"  " + s1.equals(s2));

        try {
            Student s3 = (Student)s1.clone();
            System.out.println(s3.equals(s1));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
