package com.CollectionsExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEg {
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(20);
/*
Collections extends Iterable and this Iterable has iterator function inside it
this will help us to iterate the collection

the iterator() will return a Iterator Object
*/
        Iterator<Integer> values = list.iterator();
/*
Now from this vaules object we can use the methods next() hasNext() and all others
hasNext() returns true or false
next() returns the value of the next function
 */
        while (values.hasNext()){
            System.out.println(values.next());
        }
    }
}
