package com.gla.array.Level1;

import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        
        // Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
            sc.close();
            return;
        }
        
        // Create String array to save results (from 0 to number, so size = number + 1)
        String[] results = new String[number + 1];
        
        // Loop from 0 to number and save results
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }
        
        // Display results based on index position
        System.out.println("\n===== FizzBuzz Results =====");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
        
        sc.close();
    }
}
