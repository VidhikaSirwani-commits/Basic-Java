package com.Inheritance;

public class HospitalUser {
    String name;
    int id;

    public HospitalUser() {
        System.out.println("inside the no args constructor");
    }

    public HospitalUser(String name, int id) {
        this.name = name; // this refers to current object
        this.id = id;
    }

    void display(){
        System.out.println("Name: "+ name);
        System.out.println("ID: "+id);
    }


}
