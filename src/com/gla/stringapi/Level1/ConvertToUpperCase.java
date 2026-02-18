package com.gla.stringapi.Level1;

import java.util.Scanner;

public class ConvertToUpperCase {
    
    // Method to convert text to uppercase using charAt()
    public static String toUpperCaseCustom(String text) {
        String result = "";
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // Check if character is lowercase (a-z)
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase using ASCII difference
                // ASCII 'a' = 97, 'A' = 65, difference = 32
                char upperChar = (char)(ch - 32);
                result += upperChar;
            } else {
                // Keep character as is
                result += ch;
            }
        }
        
        return result;
    }
    
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== Convert Text to Uppercase =====");
        
        System.out.print("\nEnter text: ");
        String text = sc.nextLine();
        
        // Convert using custom method (charAt)
        String upperCustom = toUpperCaseCustom(text);
        
        // Convert using built-in toUpperCase() method
        String upperBuiltIn = text.toUpperCase();
        
        // Compare the two results
        boolean areEqual = compareStrings(upperCustom, upperBuiltIn);
        
        // Display results
        System.out.println("\n===== Results =====");
        System.out.println("Original text: " + text);
        System.out.println("\nUsing charAt() method: " + upperCustom);
        System.out.println("Using toUpperCase() method: " + upperBuiltIn);
        System.out.println("\nAre both results equal? " + areEqual);
        
        // Display ASCII conversion details for first few characters
        System.out.println("\n===== ASCII Conversion Details =====");
        int limit = Math.min(5, text.length());
        for (int i = 0; i < limit; i++) {
            char original = text.charAt(i);
            char converted = upperCustom.charAt(i);
            System.out.println("Character '" + original + "' (ASCII: " + (int)original + 
                             ") -> '" + converted + "' (ASCII: " + (int)converted + ")");
        }
        
        sc.close();
    }
}
