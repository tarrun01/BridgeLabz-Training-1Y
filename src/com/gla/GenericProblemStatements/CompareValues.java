package com.gla.GenericProblemStatements;
public class CompareValues {

    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual(10, 10));
        System.out.println(isEqual("hello", "world"));
        System.out.println(isEqual(3.14, 3.14));
        System.out.println(isEqual("Java", "Java"));
    }
}
