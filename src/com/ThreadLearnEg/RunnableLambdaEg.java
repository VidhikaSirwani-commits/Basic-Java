package com.ThreadLearnEg;

public class RunnableLambdaEg {
    public static void main(String[] args) {
/* rather than creating the obj1 we will create a Runnable and then directly
create an anonymous class

also next the anonymous class can be further reduced to lambda expression
 */

// with the help of lambda and anonymous we do not need of the class now
// we are using the class only once so suitable for this condition
        // this is anonymous inner class
        Runnable obj1=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("hello");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // this is using lambda expression
        Runnable obj2= () -> {
                for (int i = 0; i < 100; i++) {
                    System.out.println("hello");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

//        R obj1= new R();
//        S obj2= new S();

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        t1.start();
        t2.start();
    }
}
