package com.gla.stringapi.Level1;
import java.util.Scanner;

public class StringToCharArray {
    
    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] characters = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        
        return characters;
    }
    
    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a text: ");
        String text = sc.next();
        
        // Get characters using user-defined method
        char[] userDefinedArray = getCharacters(text);
        
        // Get characters using built-in toCharArray() method
        char[] builtInArray = text.toCharArray();
        
        // Compare the two arrays
        boolean areEqual = compareCharArrays(userDefinedArray, builtInArray);
        
        // Display results
        System.out.println("\n===== Character Array Results =====");
        System.out.println("Original text: " + text);
        
        System.out.print("\nUser-defined method result: ");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }
        
        System.out.print("\nBuilt-in toCharArray() result: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        
        System.out.println("\n\nAre both arrays equal? " + areEqual);
        
        sc.close();
    }
}
