package com.gla.array.Level2;

import java.util.Scanner;

public class StudentGradeCalculatorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        
        // Create arrays to store data
        double[] physicsMarks = new double[numStudents];
        double[] chemistryMarks = new double[numStudents];
        double[] mathsMarks = new double[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];
        String[] remarks = new String[numStudents];
        
        // Take input for marks
        System.out.println("\nEnter marks for each student (out of 100):");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            
            // Input Physics marks with validation
            while (true) {
                System.out.print("Physics marks: ");
                physicsMarks[i] = sc.nextDouble();
                if (physicsMarks[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid marks. Please enter positive values.");
                    i--; // Decrement index to re-enter
                    break;
                }
            }
            if (physicsMarks[i] < 0) continue;
            
            // Input Chemistry marks with validation
            while (true) {
                System.out.print("Chemistry marks: ");
                chemistryMarks[i] = sc.nextDouble();
                if (chemistryMarks[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid marks. Please enter positive values.");
                    i--; // Decrement index to re-enter
                    break;
                }
            }
            if (chemistryMarks[i] < 0) continue;
            
            // Input Maths marks with validation
            while (true) {
                System.out.print("Maths marks: ");
                mathsMarks[i] = sc.nextDouble();
                if (mathsMarks[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid marks. Please enter positive values.");
                    i--; // Decrement index to re-enter
                    break;
                }
            }
        }
        
        // Calculate percentage and grade
        for (int i = 0; i < numStudents; i++) {
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300) * 100;
            
            // Determine grade and remarks based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i] = "R";
                remarks[i] = "Remedial standards";
            }
        }
        
        // Display results
        System.out.println("\n===== Student Grade Report =====");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n----- Student " + (i + 1) + " -----");
            System.out.println("Physics: " + physicsMarks[i]);
            System.out.println("Chemistry: " + chemistryMarks[i]);
            System.out.println("Maths: " + mathsMarks[i]);
            System.out.println("Percentage: " + String.format("%.2f", percentages[i]) + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println("Remarks: " + remarks[i]);
        }
        
        sc.close();
    }
}
