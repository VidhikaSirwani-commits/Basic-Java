package com.functionInterfaces;

@FunctionalInterface
interface B{
    int add(int i, int j);
}

public class LambdaWithReturn {
    public static void main(String[] args) {
        // normal way without lambda
        B obj= new B() {
            @Override
            public int add(int i, int j) {
                return i+j;
            }
        };
        System.out.println("sum : "+ obj.add(1,3));
        // with lambda
        B obj1= (i, j) -> i+j;
        System.out.println("sum: "+ obj1.add(10,20));

// easy way to understand first write it in a normal way then start remving the stuff which is boilerplate easy


    }
}
