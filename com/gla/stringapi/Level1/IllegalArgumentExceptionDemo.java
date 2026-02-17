package com.gla.stringapi.Level1;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    
    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        System.out.println("\n----- Method: generateException() -----");
        System.out.println("String: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Attempting substring with start index > end index...");
        
        int start = 5;
        int end = 2;
        System.out.println("Start index: " + start + ", End index: " + end);
        
        // This will throw IllegalArgumentException
        String result = text.substring(start, end);
        System.out.println("Substring: " + result); // This line won't execute
    }
    
    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        System.out.println("\n----- Method: handleException() -----");
        System.out.println("String: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Attempting substring with start index > end index with try-catch...");
        
        int start = 5;
        int end = 2;
        System.out.println("Start index: " + start + ", End index: " + end);
        
        try {
            String result = text.substring(start, end);
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Start index must be less than or equal to end index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
            System.out.println("Error message: " + e.getMessage());
        }
        
        System.out.println("Program continues after exception handling.");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== IllegalArgumentException Demonstration =====");
        
        System.out.print("\nEnter a string (at least 6 characters): ");
        String text = sc.next();
        
        // Uncomment the line below to see the exception being generated
        // generateException(text);
        
        System.out.println("\nNote: generateException() is commented to prevent program crash");
        System.out.println("Uncomment it to see the actual exception");
        
        // Call method to handle exception
        handleException(text);
        
        System.out.println("\n===== Program completed successfully =====");
        
        sc.close();
    }
}
