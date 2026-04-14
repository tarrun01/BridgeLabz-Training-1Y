package com.gla.JavaCollection.ListInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new LinkedHashSet<>();
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (seen.add(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        System.out.println("Input:  " + input);
        System.out.println("Output: " + removeDuplicates(input));
    }
}
