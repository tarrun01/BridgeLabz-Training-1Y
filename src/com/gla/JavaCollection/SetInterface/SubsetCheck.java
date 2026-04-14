package com.gla.JavaCollection.SetInterface;
import java.util.HashSet;
import java.util.Set;

public class SubsetCheck {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2); set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1); set2.add(2); set2.add(3); set2.add(4);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Is Set1 a subset of Set2: " + set2.containsAll(set1));

        Set<Integer> set3 = new HashSet<>();
        set3.add(1); set3.add(5);

        System.out.println("\nSet3: " + set3);
        System.out.println("Is Set3 a subset of Set2: " + set2.containsAll(set3));
    }
}
