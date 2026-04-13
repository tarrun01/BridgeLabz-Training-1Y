package com.gla.GenericProblemStatements;
public class MaximumOfThree {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max of 3, 7, 5: " + maximum(3, 7, 5));
        System.out.println("Max of 2.5, 1.8, 3.9: " + maximum(2.5, 1.8, 3.9));
        System.out.println("Max of apple, mango, banana: " + maximum("apple", "mango", "banana"));
    }
}
