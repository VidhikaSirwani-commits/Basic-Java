package com.ThreadLearnEg;

/* rules to make thread
1. extends from Thread
2. use start() to start the thread execution
3. use the run as the method name and put the statements want to run in
   the method using run()

 */
class A extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
        }
    }
}

public class ThreadEg1 {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2= new B();

        obj1.start();
        obj2.start();
    }
}
