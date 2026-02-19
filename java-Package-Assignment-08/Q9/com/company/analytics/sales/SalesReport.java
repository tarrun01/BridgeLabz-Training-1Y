package com.company.analytics.sales;

public class SalesReport {
    public void printSalesData() {
        System.out.println("========== Sales Report ==========");
        System.out.printf("%-15s | %-12s%n", "Region", "Sales (₹)");
        System.out.println("-".repeat(32));
        System.out.printf("%-15s | %-12s%n", "North",  "₹12,50,000");
        System.out.printf("%-15s | %-12s%n", "South",  "₹9,80,000");
        System.out.printf("%-15s | %-12s%n", "East",   "₹7,30,000");
        System.out.printf("%-15s | %-12s%n", "West",   "₹11,00,000");
        System.out.println("-".repeat(32));
        System.out.printf("%-15s | %-12s%n", "Total",  "₹40,60,000");
    }
}
