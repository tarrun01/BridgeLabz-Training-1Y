package com.gla.Map.ScenarioBased;
import java.util.*;

public class CourseRegistrationSystem {

    static Map<String, Integer> courses = new LinkedHashMap<>();

    static void addCourse(String code, int count) {
        courses.put(code, count);
        System.out.println("Added: " + code + " (" + count + " students)");
    }

    static void addStudent(String code) {
        if (!courses.containsKey(code)) { System.out.println("Course not found: " + code); return; }
        courses.merge(code, 1, Integer::sum);
        System.out.println("Student added to " + code + " -> " + courses.get(code));
    }

    static void dropStudent(String code) {
        if (!courses.containsKey(code)) { System.out.println("Course not found: " + code); return; }
        int updated = Math.max(0, courses.get(code) - 1);
        courses.put(code, updated);
        System.out.println("Student dropped from " + code + " -> " + updated);
    }

    public static void main(String[] args) {
        addCourse("CS101", 52);
        addCourse("CS102", 3);
        addCourse("MATH201", 48);
        addCourse("PHY301", 55);
        addCourse("ENG101", 4);

        addStudent("CS102");
        addStudent("ENG101");
        dropStudent("CS101");

        System.out.println("\nNear Full Courses (>= 50 students):");
        courses.entrySet().stream()
                .filter(e -> e.getValue() >= 50)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        System.out.println("\nUnder-subscribed Courses (< 5 students):");
        courses.entrySet().stream()
                .filter(e -> e.getValue() < 5)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
