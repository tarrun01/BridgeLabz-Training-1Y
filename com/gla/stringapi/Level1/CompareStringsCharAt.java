package com.gla.stringapi.Level1;
import java.util.Scanner;

public class CompareStringsCharAt {
    
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        // First check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for 2 strings
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        
        System.out.print("Enter second string: ");
        String str2 = sc.next();
        
        // Compare using user-defined method (charAt)
        boolean resultCharAt = compareStrings(str1, str2);
        
        // Compare using built-in equals() method
        boolean resultEquals = str1.equals(str2);
        
        // Display results
        System.out.println("\n===== Comparison Results =====");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("\nResult using charAt() method: " + resultCharAt);
        System.out.println("Result using equals() method: " + resultEquals);
        
        // Check if both methods give same result
        if (resultCharAt == resultEquals) {
            System.out.println("\nBoth methods give the same result: " + resultCharAt);
        } else {
            System.out.println("\nMethods give different results!");
        }
        
        sc.close();
    }
}
