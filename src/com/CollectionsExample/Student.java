package com.CollectionsExample;

public class Student implements Comparable<Student>{
    int age;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        if (this.age>that.age)
            return 1;
        else
            return -1;
    }
}
