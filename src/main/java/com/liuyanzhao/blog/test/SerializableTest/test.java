package com.liuyanzhao.blog.test.SerializableTest;

import org.junit.Test;

import java.io.*;

/**
 * @author: LIYANG
 * @program: ForestBlog
 * @description: none
 * @create: 2019-04-03 21:04
 **/


public class test {
//    @Test
    public void main2() throws Exception{
        Student student = new Student(1, "XXX");
        System.out.println(student);
        FileOutputStream fos = new FileOutputStream("out.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.close();
    }
    @Test
    public void main1() throws Exception{
        ObjectInputStream ois =
                new ObjectInputStream(
                        new FileInputStream(new File("out.txt")));
        Student student = (Student)ois.readObject();
        ois.close();
        System.out.println(student);
    }
}
