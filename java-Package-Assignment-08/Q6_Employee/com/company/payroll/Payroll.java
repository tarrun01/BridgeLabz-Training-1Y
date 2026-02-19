package com.company.payroll;

import com.company.hr.Employee;

public class Payroll {
    private static final double BONUS_PERCENTAGE = 10.0;

    public double calculateBonus(Employee e) {
        return e.getSalary() * BONUS_PERCENTAGE / 100;
    }

    public double calculateTotalSalary(Employee e) {
        return e.getSalary() + calculateBonus(e);
    }

    public void displayPayrollInfo(Employee e) {
        double bonus = calculateBonus(e);
        double total = calculateTotalSalary(e);
        System.out.println("--- Payroll Info for " + e.getName() + " ---");
        System.out.printf("Base Salary  : ₹%.2f%n", e.getSalary());
        System.out.printf("Bonus (10%%) : ₹%.2f%n", bonus);
        System.out.printf("Total Salary : ₹%.2f%n", total);
    }
}
