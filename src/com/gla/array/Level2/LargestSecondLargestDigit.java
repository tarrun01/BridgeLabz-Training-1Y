package com.gla.array.Level2;

import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }
        
        // Define array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        
        // Variable to reflect array index
        int index = 0;
        int originalNumber = number;
        
        // Loop to store digits in array
        while (number != 0) {
            // Remove last digit and add to array
            int digit = number % 10;
            digits[index] = digit;
            index++;
            
            // Remove last digit from number
            number = number / 10;
            
            // Break if index equals maxDigit
            if (index == maxDigit) {
                System.out.println("Maximum 10 digits reached. Remaining digits ignored.");
                break;
            }
        }
        
        // Handle zero case
        if (index == 0) {
            System.out.println("The number is 0");
            sc.close();
            return;
        }
        
        // Find largest and second largest digit
        int largest = 0;
        int secondLargest = 0;
        
        // Loop through array to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        // Display results
        System.out.println("\n===== Results =====");
        System.out.print("Digits stored: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        System.out.println("Largest digit: " + largest);
        
        if (secondLargest > 0 || (secondLargest == 0 && largest > 0)) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit: Not found (all digits are the same)");
        }
        
        sc.close();
    }
}
