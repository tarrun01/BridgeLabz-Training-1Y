package com.gla.Map.ScenarioBased;
import java.util.*;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();

        grades.put("Alice", 88.5);
        grades.put("Bob", 76.0);
        grades.put("Charlie", 91.0);
        grades.put("Diana", 65.5);
        grades.put("Eve", 83.0);

        System.out.println("Initial Grades: " + grades);

        grades.put("Bob", 85.0);
        System.out.println("After Bob retakes test: " + grades.get("Bob"));

        grades.remove("Diana");
        System.out.println("After Diana drops out: " + grades);

        System.out.println("\nStudents in Alphabetical Order:");
        new TreeMap<>(grades).forEach((name, grade) ->
                System.out.println(name + " -> " + grade));
    }
}
