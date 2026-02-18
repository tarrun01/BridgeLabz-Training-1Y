package com.gla.stringapi.Level1;
import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {
    
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        System.out.println("\n----- Method: generateException() -----");
        System.out.println("String: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Attempting to access index " + text.length() + " (beyond bounds)...");
        
        // This will throw StringIndexOutOfBoundsException
        char ch = text.charAt(text.length());
        System.out.println("Character: " + ch); // This line won't execute
    }
    
    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        System.out.println("\n----- Method: handleException() -----");
        System.out.println("String: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Attempting to access index " + text.length() + " with try-catch...");
        
        try {
            char ch = text.charAt(text.length());
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Valid index range: 0 to " + (text.length() - 1));
        }
        
        System.out.println("Program continues after exception handling.");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== StringIndexOutOfBoundsException Demonstration =====");
        
        System.out.print("\nEnter a string: ");
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
