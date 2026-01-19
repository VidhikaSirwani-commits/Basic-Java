package com.JavaEncapsulation;

import java.util.Objects;

public class PatientEncapsul {
    private String name;
    private int age;

    public PatientEncapsul() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PatientEncapsul(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PatientEncapsul that = (PatientEncapsul) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
