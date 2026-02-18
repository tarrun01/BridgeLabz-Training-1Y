package com.gla.array.Level2;

import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        
        // Create 2D array to store weight, height, and BMI
        // personData[i][0] = weight, personData[i][1] = height, personData[i][2] = BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        
        // Take input for weight and height
        System.out.println("\nEnter weight and height for each person:");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            
            // Input weight with validation
            while (true) {
                System.out.print("Weight (in kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] > 0) {
                    break;
                } else {
                    System.out.println("Invalid weight. Please enter a positive value.");
                }
            }
            
            // Input height with validation
            while (true) {
                System.out.print("Height (in cm): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] > 0) {
                    break;
                } else {
                    System.out.println("Invalid height. Please enter a positive value.");
                }
            }
        }
        
        // Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];
            
            // Convert height from cm to meters
            double heightM = heightCm / 100;
            
            // Calculate BMI and store in personData
            personData[i][2] = weight / (heightM * heightM);
            
            // Determine weight status
            double bmi = personData[i][2];
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25.0) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi < 40.0) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        // Display results
        System.out.println("\n===== BMI Report (Using 2D Array) =====");
        System.out.println("\n------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-10s %-15s%n", "Person", "Height (cm)", "Weight (kg)", "BMI", "Status");
        System.out.println("------------------------------------------------------------------");
        
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-15.2f %-15.2f %-10.2f %-15s%n", 
                (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        System.out.println("------------------------------------------------------------------");
        
        sc.close();
    }
}
