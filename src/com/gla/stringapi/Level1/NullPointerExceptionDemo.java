package com.gla.stringapi.Level1;

public class NullPointerExceptionDemo {
    
    // Method to generate NullPointerException
    public static void generateException() {
        System.out.println("\n----- Method: generateException() -----");
        String text = null;
        System.out.println("Text variable initialized to null");
        System.out.println("Attempting to call length() on null...");
        
        // This will throw NullPointerException
        int length = text.length();
        System.out.println("Length: " + length); // This line won't execute
    }
    
    // Method to handle NullPointerException
    public static void handleException() {
        System.out.println("\n----- Method: handleException() -----");
        String text = null;
        System.out.println("Text variable initialized to null");
        System.out.println("Attempting to call length() on null with try-catch...");
        
        try {
            int length = text.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Cannot call methods on a null object.");
        }
        
        System.out.println("Program continues after exception handling.");
    }
    
    public static void main(String[] args) {
        System.out.println("===== NullPointerException Demonstration =====");
        
        System.out.println("\nNote: generateException() is commented to prevent program crash");
        System.out.println("Uncomment it to see the actual exception");
        
        // Call method to handle exception
        handleException();
        
        System.out.println("\n===== Program completed successfully =====");
    }
}
