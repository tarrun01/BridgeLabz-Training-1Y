package com.gla.Map.MapInterface;
import java.util.*;

public class MergeMaps {

    public static Map<String, Integer> merge(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new LinkedHashMap<>(map1);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        System.out.println("Map1:   " + map1);
        System.out.println("Map2:   " + map2);
        System.out.println("Merged: " + merge(map1, map2));

        Map<String, Integer> sales1 = new LinkedHashMap<>();
        sales1.put("Jan", 500); sales1.put("Feb", 300);

        Map<String, Integer> sales2 = new LinkedHashMap<>();
        sales2.put("Feb", 200); sales2.put("Mar", 400);

        System.out.println("\nSales Map1: " + sales1);
        System.out.println("Sales Map2: " + sales2);
        System.out.println("Merged:     " + merge(sales1, sales2));
    }
}
