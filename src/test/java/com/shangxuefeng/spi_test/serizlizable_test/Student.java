package com.shangxuefeng.spi_test.serizlizable_test;

import com.google.common.collect.Lists;
import com.shangxuefeng.serizlizable_test.StudentV2;
import com.shangxuefeng.serizlizable_test.StudentV3;
import org.junit.Test;

import java.io.*;
import java.util.List;

/**
 * @author shangxuefeng @date 2018/3/9
 */
public class Student {
    @Test
    public void definedSerizlizable() {
        try {
            System.out.println("----- 测试序列化 -----");
            FileOutputStream fos = new FileOutputStream("defined.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            StudentV2 student = new StudentV2("One", 12, "Beijing", false);
            oos.writeObject(student);
            oos.flush();
            oos.close();
            System.out.println("----测试完成-----");
            System.out.println("-----测试 反序列化-----");
            FileInputStream fis = new FileInputStream("defined.out");
            ObjectInputStream ois = new ObjectInputStream(fis);
            StudentV2 student2 = (StudentV2)ois.readObject();
            System.out.println(student2);

            System.out.println("-----测试完成-----");
        } catch (
                FileNotFoundException e)

        {
            e.printStackTrace();
        } catch (
                IOException e)

        {
            e.printStackTrace();
        } catch (
                ClassNotFoundException e)

        {
            e.printStackTrace();
        }
    }

    @Test
    public void externalizable(){
        try {
            System.out.println("----- 测试序列化 -----");
            FileOutputStream fos = new FileOutputStream("defined.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            StudentV3 student = new StudentV3("One", 12, "Beijing", false);
            oos.writeObject(student);
            oos.flush();
            oos.close();
            System.out.println("----测试完成-----");
            System.out.println("-----测试 反序列化-----");
            FileInputStream fis = new FileInputStream("defined.out");
            ObjectInputStream ois = new ObjectInputStream(fis);
            StudentV3 student2 = (StudentV3)ois.readObject();
            System.out.println(student2);

            System.out.println("-----测试完成-----");
        } catch (
                FileNotFoundException e)

        {
            e.printStackTrace();
        } catch (
                IOException e)

        {
            e.printStackTrace();
        } catch (
                ClassNotFoundException e)

        {
            e.printStackTrace();
        }

    }
}