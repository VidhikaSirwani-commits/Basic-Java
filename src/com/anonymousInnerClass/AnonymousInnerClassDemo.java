package com.anonymousInnerClass;

class A{
    public void show(){
        System.out.println("inside the A show method");
    }
}

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        // suppose i want new implementation method defined for show but have no
        // overidden class B becase its waste of memory so we use anonymous inner class
        // we use it to define our own method at time of object, method is object specific
        A obj= new A(); // normal way

        A obj1= new A(){    // anonymous class
            public void show(){
                System.out.println("inside anonymous show..");
            }
        };
        obj1.show();
    }
}
