package com.ExceptionHandlingEg;

class A{
//    public void show(){
        // we will use try catch here
        //by writing try catch we are handling the exception not delegatin it

//        try {
//            Class.forName("com.ExceptionHandlingEg.ThrowsEg");
//        } catch (ClassNotFoundException e) {
//            System.out.println("class does not exists");
//        }


    public void show() throws ClassNotFoundException {
        // here we will throws the exception and let parent handle it
        Class.forName("com.ExceptionHandlingEg.ThrowsEg");
        // now the method above it is main so its main responsibilty to handle the exception
        // so now try catch should be in main
    }
}
public class ThrowsEg {
    public static void main(String[] args) {
        A obj=new A();

        // we can also throws the expection in main also
        //but if we thows in main then JVM will handle the exception and stop the exection abruptly
        // so not recommended to thows from main rather handle it
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // this will print all the stack which method calls which method
        }
    }
}
