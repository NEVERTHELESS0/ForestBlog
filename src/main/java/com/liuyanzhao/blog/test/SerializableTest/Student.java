package com.liuyanzhao.blog.test.SerializableTest;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: LIYANG
 * @program: ForestBlog
 * @description: none
 * @create: 2019-04-03 21:02
 **/

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private  int id;
    private  String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
