package com.gla.stringapi.Level1;
import java.util.Scanner;

public class ConvertToLowerCase {
    
    // Method to convert text to lowercase using charAt()
    public static String toLowerCaseCustom(String text) {
        String result = "";
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // Check if character is uppercase (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase using ASCII difference
                // ASCII 'A' = 65, 'a' = 97, difference = 32
                char lowerChar = (char)(ch + 32);
                result += lowerChar;
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
        
        System.out.println("===== Convert Text to Lowercase =====");
        
        System.out.print("\nEnter text: ");
        String text = sc.nextLine();
        
        // Convert using custom method (charAt)
        String lowerCustom = toLowerCaseCustom(text);
        
        // Convert using built-in toLowerCase() method
        String lowerBuiltIn = text.toLowerCase();
        
        // Compare the two results
        boolean areEqual = compareStrings(lowerCustom, lowerBuiltIn);
        
        // Display results
        System.out.println("\n===== Results =====");
        System.out.println("Original text: " + text);
        System.out.println("\nUsing charAt() method: " + lowerCustom);
        System.out.println("Using toLowerCase() method: " + lowerBuiltIn);
        System.out.println("\nAre both results equal? " + areEqual);
        
        // Display ASCII conversion details for first few characters
        System.out.println("\n===== ASCII Conversion Details =====");
        int limit = Math.min(5, text.length());
        for (int i = 0; i < limit; i++) {
            char original = text.charAt(i);
            char converted = lowerCustom.charAt(i);
            System.out.println("Character '" + original + "' (ASCII: " + (int)original + 
                             ") -> '" + converted + "' (ASCII: " + (int)converted + ")");
        }
        
        sc.close();
    }
}
