package com.company.analytics.hr;

public class EmployeeReport {
    public void printEmployeeData() {
        System.out.println("========== Employee Performance Report ==========");
        System.out.printf("%-15s | %-12s | %-10s%n", "Employee", "Department", "Rating");
        System.out.println("-".repeat(46));
        System.out.printf("%-15s | %-12s | %-10s%n", "Alice",   "Engineering", "★★★★★");
        System.out.printf("%-15s | %-12s | %-10s%n", "Bob",     "Marketing",   "★★★★☆");
        System.out.printf("%-15s | %-12s | %-10s%n", "Charlie", "Sales",       "★★★☆☆");
        System.out.printf("%-15s | %-12s | %-10s%n", "Diana",   "HR",          "★★★★★");
        System.out.println("-".repeat(46));
        System.out.println("Average Team Rating: 4.25 / 5.0");
    }
}
