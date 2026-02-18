package com.gla.stringapi.Level2;
import java.util.Scanner;

public class SplitTextIntoWords {
    
    // Method to find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception at end of string
        }
        return count;
    }
    
    // Method to split text into words using charAt()
    public static String[] splitText(String text) {
        int length = findLength(text);
        
        // Count number of words
        int wordCount = 0;
        boolean inWord = false;
        
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        
        // Create array to store space indexes
        int[] spaceIndexes = new int[wordCount + 1];
        int spaceCount = 0;
        spaceIndexes[spaceCount++] = -1; // Start before first character
        
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                if (i + 1 < length && text.charAt(i + 1) != ' ') {
                    spaceIndexes[spaceCount++] = i;
                }
            }
        }
        spaceIndexes[spaceCount] = length; // End after last character
        
        // Extract words using indexes
        String[] words = new String[wordCount];
        int wordIndex = 0;
        
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            int start = spaceIndexes[i] + 1;
            int end = spaceIndexes[i + 1];
            
            for (int j = start; j < end && j < length; j++) {
                if (text.charAt(j) != ' ') {
                    word += text.charAt(j);
                }
            }
            
            if (findLength(word) > 0) {
                words[wordIndex++] = word;
            }
        }
        
        // Trim array to actual word count
        String[] result = new String[wordIndex];
        for (int i = 0; i < wordIndex; i++) {
            result[i] = words[i];
        }
        
        return result;
    }
    
    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== Split Text Into Words =====");
        System.out.print("\nEnter text: ");
        String text = sc.nextLine();
        
        // Split using custom method
        String[] wordsCustom = splitText(text);
        
        // Split using built-in split() method
        String[] wordsBuiltIn = text.trim().split("\\s+");
        
        // Compare arrays
        boolean areEqual = compareStringArrays(wordsCustom, wordsBuiltIn);
        
        // Display results
        System.out.println("\n===== Results =====");
        System.out.print("Words using custom method: ");
        for (String word : wordsCustom) {
            System.out.print(word + " ");
        }
        
        System.out.print("\nWords using split() method: ");
        for (String word : wordsBuiltIn) {
            System.out.print(word + " ");
        }
        
        System.out.println("\n\nBoth methods match: " + areEqual);
        System.out.println("Word count: " + wordsCustom.length);
        
        sc.close();
    }
}
