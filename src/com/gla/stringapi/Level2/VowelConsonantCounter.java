package com.gla.stringapi.Level2;
import java.util.Scanner;

public class VowelConsonantCounter {
    
    // Method to check if character is vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert to lowercase if uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // ASCII difference between uppercase and lowercase
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
    
    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String text) {
        int[] count = new int[2]; // [0] = vowels, [1] = consonants
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharacterType(ch);
            
            if (type.equals("Vowel")) {
                count[0]++;
            } else if (type.equals("Consonant")) {
                count[1]++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== Vowel and Consonant Counter =====");
        System.out.print("\nEnter text: ");
        String text = sc.nextLine();
        
        // Count vowels and consonants
        int[] counts = countVowelsAndConsonants(text);
        
        // Display results
        System.out.println("\n===== Results =====");
        System.out.println("Text: " + text);
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
        System.out.println("Total Letters: " + (counts[0] + counts[1]));
        
        sc.close();
    }
}
