package com.gla.Map.ScenarioBased;
import java.util.*;

public class StudentAttendanceTracker {

    public static void main(String[] args) {
        Map<String, Integer> attendance = new LinkedHashMap<>();
        List<String> students = Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Eve");

        for (String s : students) attendance.put(s, 0);

        List<List<String>> dailyAttendance = Arrays.asList(
            Arrays.asList("Alice", "Bob", "Charlie"),
            Arrays.asList("Alice", "Diana", "Eve"),
            Arrays.asList("Bob", "Charlie", "Eve"),
            Arrays.asList("Alice", "Bob", "Diana"),
            Arrays.asList("Charlie", "Eve"),
            Arrays.asList("Alice", "Bob", "Charlie", "Diana"),
            Arrays.asList("Alice", "Eve"),
            Arrays.asList("Bob", "Charlie", "Diana", "Eve"),
            Arrays.asList("Alice", "Bob"),
            Arrays.asList("Charlie", "Diana", "Eve"),
            Arrays.asList("Alice", "Bob", "Charlie"),
            Arrays.asList("Diana", "Eve"),
            Arrays.asList("Alice", "Charlie"),
            Arrays.asList("Bob", "Diana", "Eve"),
            Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Eve")
        );

        for (List<String> day : dailyAttendance) {
            for (String s : day) {
                attendance.merge(s, 1, Integer::sum);
            }
        }

        System.out.println("Attendance after 15 days:");
        attendance.forEach((name, days) -> System.out.println(name + ": " + days + " days"));

        int threshold = 10;
        System.out.println("\nStudents with fewer than " + threshold + " days present:");
        attendance.entrySet().stream()
                .filter(e -> e.getValue() < threshold)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue() + " days"));
    }
}
