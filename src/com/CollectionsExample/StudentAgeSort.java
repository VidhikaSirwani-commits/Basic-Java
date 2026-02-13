package com.CollectionsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentAgeSort {
    public static void main(String[] args) {
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.age>o2.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> s = new ArrayList<>();
        s.add(new Student(21, "Navin"));
        s.add(new Student(26, "Harsh"));
        s.add(new Student(22, "vidhya"));
        s.add(new Student(23,"poornima"));

        // if we try natural sorting it will not work see one line below
        //Collections.sort(s); //see this does not work
        /*
        why was the above code not working but in case of Integrs it was working
        this is because if we see the Integer class it implements Compareable
        if we want our Student class to use Compareable then we will have to
        implement it with Compareable

        Compareable will have a compareTo(), we should override it and the give logic
        see the Student class we have implements Student and used compareTo()
        also defined our logic
        now this line will work
         */
        Collections.sort(s);

        // this will work now
        Collections.sort(s, com);
        System.out.println(s);
    }
}
