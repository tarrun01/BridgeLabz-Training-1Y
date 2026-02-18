package com.gla.stringapi.Level2;
import java.util.Scanner;

public class StudentVotingRandom {
    
    // Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        
        for (int i = 0; i < n; i++) {
            // Generate random age between 10 and 99
            ages[i] = (int)(Math.random() * 90) + 10;
        }
        
        return ages;
    }
    
    // Method to create 2D array with age and voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            
            // Check for negative age
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        
        return result;
    }
    
    // Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("------------------------------------------");
        System.out.printf("%-15s %-15s %-15s%n", "Student", "Age", "Can Vote?");
        System.out.println("------------------------------------------");
        
        for (int i = 0; i < data.length; i++) {
            String canVote = data[i][1].equals("true") ? "Yes" : "No";
            System.out.printf("%-15s %-15s %-15s%n", "Student " + (i + 1), data[i][0], canVote);
        }
        
        System.out.println("------------------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== Student Voting Eligibility (Random Ages) =====");
        System.out.print("\nEnter number of students: ");
        int n = sc.nextInt();
        
        // Generate random ages
        int[] ages = generateRandomAges(n);
        
        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);
        
        // Display results
        System.out.println("\n===== Voting Eligibility Results =====");
        displayTable(eligibility);
        
        // Summary
        int canVote = 0;
        for (int i = 0; i < eligibility.length; i++) {
            if (eligibility[i][1].equals("true")) {
                canVote++;
            }
        }
        
        System.out.println("\nSummary:");
        System.out.println("Total students: " + n);
        System.out.println("Can vote: " + canVote);
        System.out.println("Cannot vote: " + (n - canVote));
        
        sc.close();
    }
}
