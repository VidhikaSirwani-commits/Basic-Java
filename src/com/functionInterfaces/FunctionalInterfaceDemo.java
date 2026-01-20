package com.functionInterfaces;

@FunctionalInterface
interface A{
   // void show();
    // void display();  // if i put more than one method it will give me an error
    void show(int i); // suppose if there is an argument
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // without lamda expression
        A obj=new A(){
            @Override
            public void show(int i) {
                System.out.println("in Show" + i);
            }
        };
        obj.show(5);

        // with lambda expressions
        A obj1= (i) -> System.out.println("in lambda show");
        obj1.show(10);
    }
}
