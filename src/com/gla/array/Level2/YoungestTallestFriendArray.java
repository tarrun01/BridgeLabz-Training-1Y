package com.gla.array.Level2;

import java.util.Scanner;

public class YoungestTallestFriendArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        // Take user input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            System.out.print("Height (in cm): ");
            heights[i] = sc.nextDouble();
        }
        
        // Find youngest friend (minimum age)
        int youngestIndex = 0;
        int minAge = ages[0];
        
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }
        
        // Find tallest friend (maximum height)
        int tallestIndex = 0;
        double maxHeight = heights[0];
        
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }
        
        // Display results
        System.out.println("\n===== Results =====");
        System.out.println("The youngest friend is: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("The tallest friend is: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
        
        sc.close();
    }
}
