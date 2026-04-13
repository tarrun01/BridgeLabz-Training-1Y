package com.gla.GenericProblemStatements;
import java.util.Arrays;
import java.util.List;

public class NumericSum {

    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of integers: " + sumNumbers(intList));

        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println("Sum of doubles: " + sumNumbers(doubleList));
    }
}
