package com.gla.Map.ScenarioBased;
import java.util.*;

public class WebsiteVisitTracker {

    public static void main(String[] args) {
        Map<String, Integer> visitCounts = new HashMap<>();

        String[] visits = {"home", "about", "products", "home", "products",
                           "contact", "home", "products", "about", "home"};

        for (String page : visits) {
            visitCounts.merge(page, 1, Integer::sum);
        }

        System.out.println("Page Visit Report (sorted by descending visits):");
        visitCounts.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue() + " visits"));

        String mostVisited = Collections.max(visitCounts.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\nMost Visited Page: " + mostVisited + " (" + visitCounts.get(mostVisited) + " visits)");
    }
}
