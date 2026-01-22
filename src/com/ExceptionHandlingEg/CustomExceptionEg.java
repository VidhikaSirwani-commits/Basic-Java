package com.ExceptionHandlingEg;

class VidhiException extends Exception{
    // creating normal class will not help we have to have features of exception in it
    // 2 ways to do it either write ur own code or extend from parent ie Exception
    // it can also extend RunTimeException also any 1
    VidhiException(String string){
        super(string);
        // because i passed the string to super now my exception msg will print
    }
}

public class CustomExceptionEg {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try{
            j=18/i;
            if (j==0)
                throw new VidhiException("My custom exception is thrown");
            //now exception is thrown but have to catch it also
        } catch (VidhiException e) {
            System.out.println("catching custom exception and its msg is: " +e);
            // the message is passed to the constructor but then inside constructor
            //if we do not pass it to the super class then msg will not print
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
