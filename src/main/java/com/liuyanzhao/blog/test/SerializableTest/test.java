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
    @Test
    public void main(){
        File file = new File("OutFile.txt");

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = null;
            try {
                oos = new ObjectOutputStream(fos);
                Student student = new Student(1, "never");
                System.out.println(student);
                oos.writeObject(student);
                oos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("oos关闭失败："+e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件："+e.getMessage());
        } finally{
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("fos关闭失败："+e.getMessage());
            }
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            ObjectInputStream ois = null;
            try {
                ois = new ObjectInputStream(fis);
                try {
                    Student student = (Student)ois.readObject();   //读出对象
                    System.out.println(student);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("ois关闭失败："+e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件："+e.getMessage());
        } finally{
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("fis关闭失败："+e.getMessage());
            }
        }
    }

}
