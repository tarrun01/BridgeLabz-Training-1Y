package com.company.main;

// Single-type import
import com.company.hr.Employee;
// On-demand import
import com.company.payroll.*;

/**
 * Q6 – Employee Management System
 *
 * Folder structure must match package declaration because the Java compiler
 * and JVM use the directory path to locate class files. If the folder
 * structure doesn't match the package name, the compiler throws a
 * "package does not exist" or "class not found" error.
 *
 * Folder structure:
 * Q6_Employee/
 * ├── com/company/hr/Employee.java
 * ├── com/company/payroll/Payroll.java
 * └── com/company/main/MainApp.java
 *
 * Compile (from Q6_Employee/):
 *   javac com/company/hr/Employee.java
 *   javac com/company/payroll/Payroll.java
 *   javac com/company/main/MainApp.java
 *
 * Run:
 *   java com.company.main.MainApp
 */
public class MainApp {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John Doe", "Engineering", 60000);
        Employee e2 = new Employee(2, "Jane Smith", "Marketing", 50000);

        Payroll payroll = new Payroll();

        System.out.println("========== Employee Management System ==========\n");

        e1.displayDetails();
        System.out.println();
        payroll.displayPayrollInfo(e1);

        System.out.println("\n------------------------------------------------\n");

        e2.displayDetails();
        System.out.println();
        payroll.displayPayrollInfo(e2);
    }
}
