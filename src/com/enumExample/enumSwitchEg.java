package com.enumExample;

public class enumSwitchEg {
    public static void main(String[] args) {
        Status s= Status.SUCCESS;
        // using if
        if (s==Status.RUNNING)
            System.out.println("All Good");
        else if (s== Status.FAILED) {
            System.out.println("try again");
        } else if (s==Status.PENDING) {
            System.out.println("please wait");
        }else
            System.out.println("all done");


        // now we will do using advanced switch
        switch (s){
            case RUNNING -> System.out.println("All good");
            case FAILED -> System.out.println("try again");
            case PENDING -> System.out.println("please wait");
            case SUCCESS -> System.out.println("done");
        }
    }
}
