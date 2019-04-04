package com.liuyanzhao.blog.test.SerializableTest;

import java.io.Serializable;

/**
 * @author: LIYANG
 * @program: ForestBlog
 * @description: none
 * @create: 2019-04-03 21:02
 **/

public class Student implements Serializable {
    private static final long serialVersionUID = -1350335207596260519L;
    private int id;
    private transient String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                " name = " + name + '}';
    }
}
