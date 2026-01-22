package com.ExceptionHandlingEg;


public class ExcpEg {
    public static void main(String[] args) {
        int i=2;
        int j=0;

        try{
            j=18/i;
        }catch (Exception e){
            System.out.println("something went wrong");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
