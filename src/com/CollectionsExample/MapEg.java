package com.CollectionsExample;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class MapEg {
    public static void main(String[] args) {
        Map<String, Integer> students= new HashMap<String, Integer>();
        students.put("Navin",56);
        students.put("Harsh", 23);
        students.put("Sushil",62);
        students.put("Kiran", 92);
        System.out.println(students);
        /*
        we will see that the order is not maintained more like a set
        internally when you go you can see that there is Set used to store keys
        use get() to get the values of a key
         */
        System.out.println(students.get("Harsh"));
        /*
        keys not repeated. only the value will be updated for the key
         */
        students.put("Harsh", 66);
        System.out.println(students);

/*
keySet() will returns all the keys in the Set data type
 */
        System.out.println(students.keySet());
        for (String key: students.keySet()){
            System.out.println(key+":"+students.get(key));
        }


    }
}
