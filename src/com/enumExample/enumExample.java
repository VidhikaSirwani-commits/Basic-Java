package com.enumExample;

enum Status{
    RUNNING, FAILED, PENDING, SUCCESS;
}

public class enumExample {
    public static void main(String[] args) {
        // i want to print all the values in enum
        // note in java all enum is a class and the elements inside enum is objects
        Status[] ss= Status.values();

        // i will print all the values with ther ordinal number
        for(Status s: ss){
            // above statment explains in this way like
            // for each element s of type Status class inside the collection ss
            // now perform action on that each element
            System.out.println(s+ ":"+ s.ordinal());
        }
    }
}
