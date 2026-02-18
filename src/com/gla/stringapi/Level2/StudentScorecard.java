package com.gla.stringapi.Level2;
import java.util.Scanner;

public class StudentScorecard {
    
    // Method to generate random 2-digit scores for PCM
    public static double[][] generateScores(int numStudents) {
        double[][] scores = new double[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            // Generate random scores between 10 and 99
            scores[i][0] = (int)(Math.random() * 90) + 10; // Physics
            scores[i][1] = (int)(Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int)(Math.random() * 90) + 10; // Maths
        }
        
        return scores;
    }
    
    // Method to calculate total, average, and percentage
    public static double[][] calculateStats(double[][] scores) {
        double[][] stats = new double[scores.length][3];
        
        for (int i = 0; i < scores.length; i++) {
            // Calculate total
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            stats[i][0] = Math.round(total * 100.0) / 100.0;
            
            // Calculate average
            double average = total / 3;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            
            // Calculate percentage
            double percentage = (total / 300) * 100;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        
        return stats;
    }
    
    // Method to calculate grades
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];
            
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        
        return grades;
    }
    
    // Method to display scorecard
    public static void displayScorecard(double[][] scores, double[][] stats, String[] grades) {
        System.out.println("\n===== Student Scorecard =====");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-12s %-8s%n", 
            "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("-----------------------------------------------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10s %-10.0f %-10.0f %-10.0f %-10.2f %-10.2f %-12.2f%% %-8s%n",
                "S" + (i + 1),
                scores[i][0],    // Physics
                scores[i][1],    // Chemistry
                scores[i][2],    // Maths
                stats[i][0],     // Total
                stats[i][1],     // Average
                stats[i][2],     // Percentage
                grades[i]);      // Grade
        }
        
        System.out.println("-----------------------------------------------------------------------------------------");
        
        // Grade legend
        System.out.println("\nGrade Legend:");
        System.out.println("A: 80% and above (Level 4, above agency-normalized standards)");
        System.out.println("B: 70-79% (Level 3, at agency-normalized standards)");
        System.out.println("C: 60-69% (Level 2, below, but approaching agency-normalized standards)");
        System.out.println("D: 50-59% (Level 1, well below agency-normalized standards)");
        System.out.println("E: 40-49% (Level 1-, too below agency-normalized standards)");
        System.out.println("R: 39% and below (Remedial standards)");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== Student Scorecard Generator =====");
        System.out.print("\nEnter number of students: ");
        int numStudents = sc.nextInt();
        
        // Generate random scores
        double[][] scores = generateScores(numStudents);
        
        // Calculate stats
        double[][] stats = calculateStats(scores);
        
        // Calculate grades
        String[] grades = calculateGrades(stats);
        
        // Display scorecard
        displayScorecard(scores, stats, grades);
        
        sc.close();
    }
}
