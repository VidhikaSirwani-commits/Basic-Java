package com.CollectionsExample;

import java.util.*;

public class SetEg {
    public static void main(String[] args) {
/*
Set has following features
1. no duplicates
2. no insertion order is maintained
3. does not support index values
 Note: if we want sorted values in set the go for treeset
 */
        Set<Integer> list= new HashSet<Integer>();
        // values are not sorted in HashSet
        Set<Integer> list1= new TreeSet<Integer>();
        // values will be in sorted format for this set because
//Treeset(implements) -> NavigationalSet(extends) -> SortedSet
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(20);

    }
}
