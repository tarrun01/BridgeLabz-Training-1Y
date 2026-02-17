package com.gla.stringapi.Level2;
import java.util.Scanner;

public class StringLengthWithoutMethod {
    
    // Method to find string length without using length() method
    public static int findLength(String str) {
        int count = 0;
        
        try {
            // Use infinite loop to count characters
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception thrown when we reach the end of string
            // Return the count
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== Find String Length =====");
        System.out.print("\nEnter a string: ");
        String text = sc.next();
        
        // Call user-defined method
        int lengthCustom = findLength(text);
        
        // Call built-in length() method
        int lengthBuiltIn = text.length();
        
        // Display results
        System.out.println("\n===== Results =====");
        System.out.println("String: " + text);
        System.out.println("Length using custom method: " + lengthCustom);
        System.out.println("Length using built-in method: " + lengthBuiltIn);
        System.out.println("Both methods match: " + (lengthCustom == lengthBuiltIn));
        
        sc.close();
    }
}
