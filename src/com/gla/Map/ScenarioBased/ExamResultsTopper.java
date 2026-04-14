package com.gla.Map.ScenarioBased;
import java.util.*;

public class ExamResultsTopper {

    public static void main(String[] args) {
        Map<String, Map<String, Integer>> results = new LinkedHashMap<>();

        Map<String, Integer> mathScores = new LinkedHashMap<>();
        mathScores.put("Alice", 88); mathScores.put("Bob", 95);
        mathScores.put("Charlie", 72); mathScores.put("Diana", 91);
        results.put("Math", mathScores);

        Map<String, Integer> scienceScores = new LinkedHashMap<>();
        scienceScores.put("Alice", 93); scienceScores.put("Bob", 78);
        scienceScores.put("Charlie", 85); scienceScores.put("Diana", 96);
        results.put("Science", scienceScores);

        Map<String, Integer> englishScores = new LinkedHashMap<>();
        englishScores.put("Alice", 76); englishScores.put("Bob", 88);
        englishScores.put("Charlie", 65); englishScores.put("Diana", 70);
        results.put("English", englishScores);

        Map<String, Integer> historyScores = new LinkedHashMap<>();
        historyScores.put("Alice", 60); historyScores.put("Bob", 55);
        historyScores.put("Charlie", 92); historyScores.put("Diana", 80);
        results.put("History", historyScores);

        System.out.println("Top Scorer per Subject:");
        for (Map.Entry<String, Map<String, Integer>> subject : results.entrySet()) {
            String topStudent = Collections.max(subject.getValue().entrySet(),
                    Map.Entry.comparingByValue()).getKey();
            System.out.println(subject.getKey() + " -> " + topStudent
                    + " (" + subject.getValue().get(topStudent) + ")");
        }

        System.out.println("\nAverage Score per Subject:");
        for (Map.Entry<String, Map<String, Integer>> subject : results.entrySet()) {
            double avg = subject.getValue().values().stream()
                    .mapToInt(Integer::intValue).average().orElse(0);
            System.out.printf("%s -> %.2f%n", subject.getKey(), avg);
        }

        System.out.println("\nSubjects with at Least One Score Above 90:");
        for (Map.Entry<String, Map<String, Integer>> subject : results.entrySet()) {
            boolean hasAbove90 = subject.getValue().values().stream().anyMatch(v -> v > 90);
            if (hasAbove90) System.out.println(subject.getKey());
        }
    }
}
