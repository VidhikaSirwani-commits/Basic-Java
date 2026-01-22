package com.ExceptionHandlingEg;

public class ThrowEg {
    public static void main(String[] args) {
        int i=0;
        int j=0;

        try{
            j=18/i;
//        throw used to throw an exception and forced to execute the catch block
/* in real world we can consider suppose if above we have tried to connect to a db
 but that db connect has failed. so now with if we check for it and if its failed,
 we forcefully throw the exception and in catch block we will have written the logic
 to connect to a backup db, so this way we are trying to handle the exception */
            if (j==0)
                throw new ArithmeticException("I do not want to print 0");
// inside constructor i am passing the message which i want to print in the console
        } catch (ArithmeticException e) {
            j= 18/1; // handling by performing a default function
            System.out.println("arithmetic exception");
        } catch (Exception e) {
            System.out.println("executing the parent Expection");
        }
    }
}
