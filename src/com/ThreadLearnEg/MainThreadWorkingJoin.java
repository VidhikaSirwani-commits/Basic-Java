package com.ThreadLearnEg;

class Counter{
    int count;
// before when we did not have synchronized we were getting a incorrect results
/*
  this was because both threads would access and modify the incement method
  at the same time. but now only one thread can access that method and
  cannot modify at same time so they execute properly
  Note: so whenever we have shared resources we make them synchronized
  so if t1 access method t2 will wait and t2 using the method t1 will wait
 */
    public synchronized void increment(){
        count++;
    }

        }
public class MainThreadWorkingJoin {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        Runnable obj1=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <=1000; i++) {
                    c.increment();
                }
            }
        };

        // this is using lambda expression
        Runnable obj2= () -> {
            for (int i = 0; i <= 1000; i++) {
                c.increment();
            }
        };

//        R obj1= new R();
//        S obj2= new S();

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
// if the join() was not there then i was getting 0 for count always
        System.out.println(c.count);
    }
}
