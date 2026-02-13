package com.CollectionsExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ListEg {
    public static void main(String[] args) {
        // if we give collections it will not support index values
//        Collection list= new ArrayList<>();
// if we do not specify Generics then all elements are considered as an Object
// iterating the object is okay but suppose if we perform some operations it
// will give us exceptions
        List<Integer> list= new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(20);
 // when i give generics then the below line will give error
 // generics is like we are mentioning which type of data the list supports
       // list.add("234");
// can be used only for list as they support indexes
// this will tell the index of the element
        System.out.println(list.indexOf(10));
// if not present it gives -1
        System.out.println(list.indexOf(234));

// this will tell which element is at the index
        System.out.println(list.get(2));
// if i give a higher index i get exception ie index out of bounds
       // System.out.println(list.get(30));


        for (Object n: list){
            int num= (Integer)n;  // we are doing typecating
            // when generics is added i no need to typecaste now
            System.out.println(num*2);
 // for above line i get ClassCastException because generics is not given for the List
 // so now trying to do * on a string doesnot work

        }


    }
}
