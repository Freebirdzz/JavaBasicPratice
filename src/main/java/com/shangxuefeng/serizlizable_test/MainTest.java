package com.shangxuefeng.serizlizable_test;

import com.google.common.collect.Lists;

import java.io.*;
import java.util.List;

public class MainTest {
    /**
     * 序列化数组
     */
    public void testArray(){
        System.out.println("-----测试序列化-----");
        List<String> list = Lists.newArrayList("One", "Two", "Three");
        list.stream().forEach(System.out::println);

        try {
            FileOutputStream fos = new FileOutputStream("array.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.flush();
            oos.close();
            System.out.println("----测试完成-----");
            System.out.println("-----测试 反序列化-----");
            FileInputStream fis = new FileInputStream("array.out");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<String> outList = (List<String>)ois.readObject();
            outList.stream().forEach(System.out::println);
            System.out.println("-----测试完成-----");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void testClass(){
        System.out.println("-----测试序列化-----");
        try {
            FileOutputStream fos = new FileOutputStream("temp.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Student stu = new Student();
            oos.writeObject(stu);
            oos.flush();
            oos.close();
            System.out.println("----测试完成-----");
            System.out.println("-----测试 反序列化-----");
            FileInputStream fis = new FileInputStream("temp.out");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student deTest = (Student) ois.readObject();
            System.out.println(deTest);
            System.out.println("-----测试完成-----");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
    public void testClassArray(){
        System.out.println("-----测试序列化-----");
        try {
            FileOutputStream fos = new FileOutputStream("classArray.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            List<Student> list = Lists.newArrayList(
                    new Student("One", 12, "Beijing", false),
                    new Student("Two", 21, "ChengDu", true),
                    new Student("Three", 46, "Huhhot", false));
            oos.writeObject(list);
            list.stream().forEach(System.out::println);
            oos.flush();
            oos.close();
            System.out.println("----测试完成-----");
            System.out.println("-----测试 反序列化-----");
            FileInputStream fis = new FileInputStream("classArray.out");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Student> outList = (List<Student>) ois.readObject();
            outList.stream().forEach(System.out::println);
            System.out.println("-----测试完成-----");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    public void serial(){
        try {
            System.out.println("---执行序列化---");
            FileOutputStream fos = new FileOutputStream("tmp.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            StudentV2 student = new StudentV2("One", 12, "Beijing", false);
            oos.writeObject(student);
            oos.flush();
            oos.close();
            System.out.println(student);
            System.out.println("---序列化完成---");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void deserial(){
        try {
            System.out.println("-----测试 反序列化-----");
            FileInputStream fis = new FileInputStream("tmp.out");
            ObjectInputStream ois = new ObjectInputStream(fis);
            StudentV2 student = (StudentV2)ois.readObject();
            System.out.println(student);
            System.out.println("-----测试完成-----");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        MainTest mt = new MainTest();
       // mt.testArray();
       // mt.testClassArray();

        //mt.testClass();
     //   mt.serial();
       mt.deserial();
    }
}
