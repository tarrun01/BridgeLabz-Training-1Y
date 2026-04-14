package com.gla.Map.ScenarioBased;
import java.util.*;

public class EmployeeSalaryDirectory {

    static Map<String, Double> salaries = new HashMap<>();

    static void addEmployee(String name, double salary) {
        salaries.put(name, salary);
    }

    static void giveRaise(String name, double percent) {
        if (!salaries.containsKey(name)) { System.out.println("Employee not found: " + name); return; }
        double newSalary = salaries.get(name) * (1 + percent / 100);
        salaries.put(name, newSalary);
        System.out.printf("Raise given to %s -> New Salary: %.2f%n", name, newSalary);
    }

    public static void main(String[] args) {
        addEmployee("Alice", 70000);
        addEmployee("Bob", 55000);
        addEmployee("Charlie", 90000);
        addEmployee("Diana", 62000);
        addEmployee("Eve", 48000);
        addEmployee("Frank", 105000);

        giveRaise("Alice", 10);
        giveRaise("Bob", 15);
        giveRaise("Ghost", 5);

        double avg = salaries.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.printf("%nAverage Salary: %.2f%n", avg);

        double maxSalary = Collections.max(salaries.values());
        System.out.println("\nHighest Paid Employee(s):");
        salaries.entrySet().stream()
                .filter(e -> e.getValue() == maxSalary)
                .forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));
    }
}
