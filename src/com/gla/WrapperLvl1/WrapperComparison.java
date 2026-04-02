package com.gla.WrapperLvl1;
public class WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b : " + (a == b));
        System.out.println("c == d : " + (c == d));
        System.out.println("a.equals(b) : " + a.equals(b));

        System.out.println();
        System.out.println("Explanation:");
        System.out.println("Java caches Integer objects for values -128 to 127.");
        System.out.println("So a and b point to the same cached object -> a == b is true.");
        System.out.println("200 is outside the cache range, so c and d are different objects -> c == d is false.");
        System.out.println("equals() compares values, not references, so it always gives the correct result.");
    }
}
