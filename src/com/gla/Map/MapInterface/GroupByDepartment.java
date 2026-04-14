package com.gla.Map.MapInterface;
import java.util.*;

class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String toString() { return name; }
}

public class GroupByDepartment {

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> grouped = new LinkedHashMap<>();
        for (Employee e : employees) {
            grouped.computeIfAbsent(e.getDepartment(), k -> new ArrayList<>()).add(e);
        }
        return grouped;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));
        employees.add(new Employee("Dave", "IT"));
        employees.add(new Employee("Eve", "Finance"));

        Map<String, List<Employee>> result = groupByDepartment(employees);

        System.out.println("Employees grouped by department:");
        for (Map.Entry<String, List<Employee>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
