package com.InterfaceExample;

interface A{
    int age=44;  // all the variables are always static and final in interfaces
    String area="Mumbai";

    void show();
    void config();
}

class B implements A{

    @Override
    public void show() {
        System.out.println("implemted the method show from A");
    }

    @Override
    public void config() {
        System.out.println("implemented the method config from B");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
        obj.config();
    }
}
