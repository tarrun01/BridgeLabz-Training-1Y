package com.gla.array.Level1;

import java.util.Scanner;

public class MeanHeightFootball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create double array of size 11 (football team players)
        double[] heights = new double[11];
        
        System.out.println("Enter heights of 11 football players (in cm):");
        
        // Get input values from user
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = sc.nextDouble();
        }
        
        // Find sum of all elements
        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        
        // Calculate mean: mean = sum / number of elements
        double mean = sum / 11;
        
        // Display result
        System.out.println("\n===== Results =====");
        System.out.println("Total height: " + sum + " cm");
        System.out.println("Number of players: 11");
        System.out.println("Mean height of football team: " + String.format("%.2f", mean) + " cm");
        
        sc.close();
    }
}
