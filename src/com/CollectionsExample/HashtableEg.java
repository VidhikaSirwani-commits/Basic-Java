package com.CollectionsExample;

import java.util.Hashtable;
import java.util.Map;

public class HashtableEg {
    public static void main(String[] args) {
        Map<String, Integer> students= new Hashtable<>();
        /*
        Hashtable() is synchronized and works with only one thread at a time
        if we want multithreading then go for HashMap()
        copyOnWriteArrayList
         */
        students.put("Navin",56);
        students.put("Harsh", 23);
        students.put("Sushil",62);
        students.put("Kiran", 92);
        System.out.println(students);

        System.out.println(students.get("Harsh"));

        students.put("Harsh", 66);
        System.out.println(students);

        System.out.println(students.keySet());
        for (String key: students.keySet()){
            System.out.println(key+":"+students.get(key));
        }

    }
}
