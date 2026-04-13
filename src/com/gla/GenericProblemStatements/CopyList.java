package com.gla.GenericProblemStatements;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyList {

    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) {
            dest.add(n);
        }
    }

    public static void main(String[] args) {
        List<Integer> src = Arrays.asList(1, 2, 3, 4, 5);
        List<Number> dest = new ArrayList<>();

        copyList(dest, src);
        System.out.println("Copied list: " + dest);

        List<Double> src2 = Arrays.asList(1.1, 2.2, 3.3);
        copyList(dest, src2);
        System.out.println("After second copy: " + dest);
    }
}
