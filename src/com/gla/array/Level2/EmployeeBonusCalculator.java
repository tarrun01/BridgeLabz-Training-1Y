package com.gla.array.Level2;

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int NUM_EMPLOYEES = 10;
        
        // Define arrays to save salary and years of service
        double[] salaries = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        
        // Define arrays to save new salary and bonus
        double[] newSalaries = new double[NUM_EMPLOYEES];
        double[] bonuses = new double[NUM_EMPLOYEES];
        
        // Variables to save totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        
        // Take input from user
        System.out.println("Enter salary and years of service for 10 employees:");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            
            // Input salary with validation
            while (true) {
                System.out.print("Enter salary: ");
                salaries[i] = sc.nextDouble();
                if (salaries[i] > 0) {
                    break;
                } else {
                    System.out.println("Invalid salary. Please enter a positive value.");
                }
            }
            
            // Input years of service with validation
            while (true) {
                System.out.print("Enter years of service: ");
                yearsOfService[i] = sc.nextDouble();
                if (yearsOfService[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid years of service. Please enter a non-negative value.");
                }
            }
        }
        
        // Calculate bonus for each employee
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                // 5% bonus for more than 5 years
                bonuses[i] = salaries[i] * 0.05;
            } else {
                // 2% bonus for 5 years or less
                bonuses[i] = salaries[i] * 0.02;
            }
            
            // Calculate new salary
            newSalaries[i] = salaries[i] + bonuses[i];
            
            // Add to totals
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        
        // Display results
        System.out.println("\n===== Employee Bonus Report =====");
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.println("  Old Salary: $" + String.format("%.2f", salaries[i]));
            System.out.println("  Years of Service: " + yearsOfService[i]);
            System.out.println("  Bonus: $" + String.format("%.2f", bonuses[i]));
            System.out.println("  New Salary: $" + String.format("%.2f", newSalaries[i]));
        }
        
        System.out.println("\n===== Summary =====");
        System.out.println("Total Old Salary: $" + String.format("%.2f", totalOldSalary));
        System.out.println("Total Bonus Payout: $" + String.format("%.2f", totalBonus));
        System.out.println("Total New Salary: $" + String.format("%.2f", totalNewSalary));
        
        sc.close();
    }
}
