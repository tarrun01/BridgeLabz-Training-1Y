package com.gla.Map.ScenarioBased;
import java.util.*;

public class EmployeeDepartmentMapping {

    static Map<Integer, String> employeeDept = new HashMap<>();

    static void addEmployee(int id, String dept) {
        employeeDept.put(id, dept);
        System.out.println("Added Employee ID " + id + " -> " + dept);
    }

    static void changeDepartment(int id, String newDept) {
        if (!employeeDept.containsKey(id)) { System.out.println("Employee not found: " + id); return; }
        employeeDept.put(id, newDept);
        System.out.println("Employee " + id + " moved to " + newDept);
    }

    static void findByDepartment(String dept) {
        System.out.println("Employees in " + dept + ":");
        employeeDept.entrySet().stream()
                .filter(e -> e.getValue().equals(dept))
                .forEach(e -> System.out.println("  ID: " + e.getKey()));
    }

    public static void main(String[] args) {
        addEmployee(101, "IT");
        addEmployee(102, "HR");
        addEmployee(103, "IT");
        addEmployee(104, "Finance");
        addEmployee(105, "HR");
        addEmployee(106, "IT");

        changeDepartment(102, "IT");

        findByDepartment("IT");
        findByDepartment("HR");

        System.out.println("\nTotal Employees per Department:");
        Map<String, Long> deptCount = new TreeMap<>();
        for (String dept : employeeDept.values()) {
            deptCount.merge(dept, 1L, Long::sum);
        }
        deptCount.forEach((dept, count) -> System.out.println(dept + ": " + count));
    }
}
