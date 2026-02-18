package com.gla.stringapi.Level2;
import java.util.Scanner;

public class CharacterTypeDisplay {
    
    // Method to check if character is vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert to lowercase if uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        
        // Check if it's a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check if vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }
    
    // Method to get character types in 2D array
    public static String[][] getCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        
        return result;
    }
    
    // Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("--------------------------------");
        System.out.printf("%-15s %-15s%n", "Character", "Type");
        System.out.println("--------------------------------");
        
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-15s %-15s%n", data[i][0], data[i][1]);
        }
        
        System.out.println("--------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== Character Type Analyzer =====");
        System.out.print("\nEnter text: ");
        String text = sc.nextLine();
        
        // Get character types
        String[][] characterTypes = getCharacterTypes(text);
        
        // Display results
        System.out.println("\n===== Character Analysis =====");
        displayTable(characterTypes);
        
        // Count summary
        int vowels = 0, consonants = 0, others = 0;
        for (int i = 0; i < characterTypes.length; i++) {
            if (characterTypes[i][1].equals("Vowel")) {
                vowels++;
            } else if (characterTypes[i][1].equals("Consonant")) {
                consonants++;
            } else {
                others++;
            }
        }
        
        System.out.println("\nSummary:");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Other characters: " + others);
        
        sc.close();
    }
}
