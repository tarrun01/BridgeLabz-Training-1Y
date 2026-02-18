package com.gla.array.Level2;

import java.util.Scanner;

public class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        
        // Create 2D array to store marks (Physics, Chemistry, Maths)
        // marks[i][0] = Physics, marks[i][1] = Chemistry, marks[i][2] = Maths
        double[][] marks = new double[numStudents][3];
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
                marks[i][0] = sc.nextDouble();
                if (marks[i][0] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid marks. Please enter positive values.");
                    i--; // Decrement index to re-enter
                    break;
                }
            }
            if (marks[i][0] < 0) continue;
            
            // Input Chemistry marks with validation
            while (true) {
                System.out.print("Chemistry marks: ");
                marks[i][1] = sc.nextDouble();
                if (marks[i][1] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid marks. Please enter positive values.");
                    i--; // Decrement index to re-enter
                    break;
                }
            }
            if (marks[i][1] < 0) continue;
            
            // Input Maths marks with validation
            while (true) {
                System.out.print("Maths marks: ");
                marks[i][2] = sc.nextDouble();
                if (marks[i][2] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid marks. Please enter positive values.");
                    i--; // Decrement index to re-enter
                    break;
                }
            }
        }
        
        // Calculate percentage and grade using 2D array
        for (int i = 0; i < numStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
        System.out.println("\n===== Student Grade Report (Using 2D Array) =====");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n----- Student " + (i + 1) + " -----");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Total: " + (marks[i][0] + marks[i][1] + marks[i][2]));
            System.out.println("Percentage: " + String.format("%.2f", percentages[i]) + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println("Remarks: " + remarks[i]);
        }
        
        sc.close();
    }
}
