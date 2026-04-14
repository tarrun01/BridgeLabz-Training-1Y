package com.gla.JavaCollection.SetInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToSortedList {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5); set.add(3); set.add(9); set.add(1);

        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);

        System.out.println("Input Set: " + set);
        System.out.println("Sorted List: " + sortedList);
    }
}
