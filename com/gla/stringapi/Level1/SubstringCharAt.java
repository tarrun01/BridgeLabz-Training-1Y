package com.gla.stringapi.Level1;
import java.util.Scanner;

public class SubstringCharAt {
    
    // Method to create substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        
        for (int i = start; i < end && i < str.length(); i++) {
            result += str.charAt(i);
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
        
        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();
        
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        
        // Create substring using user-defined method (charAt)
        String substringCharAt = createSubstring(text, start, end);
        
        // Create substring using built-in substring() method
        String substringBuiltIn = "";
        try {
            substringBuiltIn = text.substring(start, end);
        } catch (Exception e) {
            System.out.println("Error with built-in substring: " + e.getMessage());
        }
        
        // Compare the two substrings
        boolean areEqual = compareStrings(substringCharAt, substringBuiltIn);
        
        // Display results
        System.out.println("\n===== Substring Results =====");
        System.out.println("Original string: " + text);
        System.out.println("Start index: " + start);
        System.out.println("End index: " + end);
        System.out.println("\nSubstring using charAt(): " + substringCharAt);
        System.out.println("Substring using substring(): " + substringBuiltIn);
        System.out.println("\nAre both substrings equal? " + areEqual);
        
        sc.close();
    }
}
