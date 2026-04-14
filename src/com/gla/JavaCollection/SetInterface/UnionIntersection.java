package com.gla.JavaCollection.SetInterface;    
import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1); set1.add(2); set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3); set2.add(4); set2.add(5);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
