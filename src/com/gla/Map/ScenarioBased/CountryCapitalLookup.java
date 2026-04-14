package com.gla.Map.ScenarioBased;
import java.util.*;

public class CountryCapitalLookup {

    static Map<String, String> capitals = new TreeMap<>();

    static void lookup(String country) {
        System.out.println(country + " -> " + capitals.getOrDefault(country, "Unknown country"));
    }

    public static void main(String[] args) {
        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington D.C.");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Japan", "Tokyo");
        capitals.put("Brazil", "Brasilia");
        capitals.put("Australia", "Canberra");
        capitals.put("Canada", "Ottawa");

        lookup("India");
        lookup("France");
        lookup("China");

        System.out.println("\nAll Countries (Alphabetical Order):");
        capitals.forEach((country, capital) ->
                System.out.println(country + " -> " + capital));
    }
}
