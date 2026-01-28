package com.ThreadLearnEg;

/* how to create thread with the Runnable
1. implement it with Runnable
2. run() in the class to run the code for threads
Note: the start() method will not work now because
Runnable is a functional interface and has only 1 method which is run()
3. create Thread obj and pass a Runnable object inside it
Note: when implement is there so now when object is created it is an Runnable object
4. Now you can start() a Thread

eg
Runnable obj1= new P();
Runnable obj2= new Q();
 */
class P implements Runnable{

//Note: Runnable is a functional interface so we can use lambda expression here
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Q implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableInterfaceWay {
    public static void main(String[] args) {
        P obj1= new P();
        Q obj2= new Q();

        //note now the start() method will not work
//        obj1.start();
//        obj2.start();

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        t1.start();
        t2.start();

    }
}
