package com.gla.Map.MapInterface;
import java.util.*;

public class MaxValueKey {

    public static String findMaxKey(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        System.out.println("Input:  " + map);
        System.out.println("Key with max value: " + findMaxKey(map));

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 88);
        scores.put("Bob", 95);
        scores.put("Charlie", 72);
        scores.put("Diana", 91);

        System.out.println("\nInput:  " + scores);
        System.out.println("Top scorer: " + findMaxKey(scores));
    }
}
