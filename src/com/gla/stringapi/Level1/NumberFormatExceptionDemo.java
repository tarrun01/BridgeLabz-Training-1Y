package com.gla.stringapi.Level1;

import java.util.Scanner;

public class NumberFormatExceptionDemo {
    
    // Method to generate NumberFormatException
    public static void generateException(String text) {
        System.out.println("\n----- Method: generateException() -----");
        System.out.println("Text: " + text);
        System.out.println("Attempting to parse as integer...");
        
        // This will throw NumberFormatException if text is not a valid number
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number); // This may not execute
    }
    
    // Method to handle NumberFormatException
    public static void handleException(String text) {
        System.out.println("\n----- Method: handleException() -----");
        System.out.println("Text: " + text);
        System.out.println("Attempting to parse as integer with try-catch...");
        
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
            System.out.println("Successfully parsed!");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("The text '" + text + "' is not a valid number.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
            System.out.println("Error message: " + e.getMessage());
        }
        
        System.out.println("Program continues after exception handling.");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== NumberFormatException Demonstration =====");
        
        System.out.print("\nEnter text (try with non-numeric text): ");
        String text = sc.next();
        
        // Uncomment the line below to see the exception being generated
        // generateException(text);
        
        System.out.println("\nNote: generateException() is commented to prevent program crash");
        System.out.println("Uncomment it to see the actual exception");
        
        // Call method to handle exception
        handleException(text);
        
        // Demonstrate with valid number
        System.out.println("\n----- Testing with valid number -----");
        handleException("12345");
        
        System.out.println("\n===== Program completed successfully =====");
        
        sc.close();
    }
}
