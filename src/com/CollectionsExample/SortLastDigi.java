package com.CollectionsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLastDigi {
    public static void main(String[] args) {
        Comparator<Integer> com= new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1%10 > o2%10)
                    return 1;
                else
                    return -1;
            }
            /*
            return 1 means no swaping
            return -1 means we will swap
            and return 0 means do not do anything
            so can say if negative values means we will swap orelse do nothing
             */
        };

        List<Integer> nums= new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums, com);

        System.out.println(nums);
    }
}
