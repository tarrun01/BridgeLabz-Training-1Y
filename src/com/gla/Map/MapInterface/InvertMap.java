package com.gla.Map.MapInterface;
import java.util.*;

public class InvertMap {

    public static <K, V> Map<V, List<K>> invert(Map<K, V> original) {
        Map<V, List<K>> inverted = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : original.entrySet()) {
            inverted.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        return inverted;
    }

    public static void main(String[] args) {
        Map<String, Integer> input = new LinkedHashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        System.out.println("Input:  " + input);
        System.out.println("Output: " + invert(input));

        Map<String, String> input2 = new LinkedHashMap<>();
        input2.put("Alice", "HR");
        input2.put("Bob", "IT");
        input2.put("Carol", "HR");
        input2.put("Dave", "IT");

        System.out.println("\nInput:  " + input2);
        System.out.println("Output: " + invert(input2));
    }
}
