package com.gla.stringapi.Level1;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("\n----- Method: generateException() -----");
        System.out.println("Array length: " + names.length);
        System.out.println("Attempting to access index " + names.length + " (beyond bounds)...");
        
        // This will throw ArrayIndexOutOfBoundsException
        String name = names[names.length];
        System.out.println("Name: " + name); // This line won't execute
    }
    
    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        System.out.println("\n----- Method: handleException() -----");
        System.out.println("Array length: " + names.length);
        System.out.println("Attempting to access index " + names.length + " with try-catch...");
        
        try {
            String name = names[names.length];
            System.out.println("Name: " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Valid index range: 0 to " + (names.length - 1));
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
            System.out.println("Error message: " + e.getMessage());
        }
        
        System.out.println("Program continues after exception handling.");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== ArrayIndexOutOfBoundsException Demonstration =====");
        
        System.out.print("\nEnter number of names: ");
        int size = sc.nextInt();
        
        String[] names = new String[size];
        
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        
        // Display array contents
        System.out.println("\nArray contents:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Index " + i + ": " + names[i]);
        }
        
        // Uncomment the line below to see the exception being generated
        // generateException(names);
        
        System.out.println("\nNote: generateException() is commented to prevent program crash");
        System.out.println("Uncomment it to see the actual exception");
        
        // Call method to handle exception
        handleException(names);
        
        System.out.println("\n===== Program completed successfully =====");
        
        sc.close();
    }
}
