package com.school.main;

import com.school.data.*;
import com.school.util.*;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("========= Student Performance Analyzer =========\n");

        Student[] students = {
            new Student("Alice",   88, 92, 76),
            new Student("Bob",     55, 60, 48),
            new Student("Charlie", 95, 98, 99),
            new Student("Diana",   70, 65, 72),
        };

        Analyzer analyzer = new Analyzer();

        System.out.printf("%-45s | %-8s | %-6s%n", "Details", "Average", "Grade");
        System.out.println("-".repeat(70));

        for (Student s : students) {
            double avg   = analyzer.calculateAverage(s);
            String grade = analyzer.findGrade(avg);
            System.out.printf("%s | %7.2f  | %s%n", s.toString(), avg, grade);
        }
    }
}
