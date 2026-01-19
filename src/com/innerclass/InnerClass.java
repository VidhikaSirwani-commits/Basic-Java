package com.innerclass;

class A{
    public void show(){
        System.out.println("inside show method..");
    }

    class B{
        public void config(){
            System.out.println("inside config method.. inner class method");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A objA=new A();
        objA.show();

        // way to access inner class
        A.B objB= objA.new B();
        objB.config();

        // if inner class is static then no need of obj can directly create obj
//        A.B objB= new A.B();
//        objB.config();
    }
}
