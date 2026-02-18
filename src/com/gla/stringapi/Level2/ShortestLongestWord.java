package com.gla.stringapi.Level2;
import java.util.Scanner;

public class ShortestLongestWord {
    
    // Method to find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
    
    // Method to split text into words using charAt()
    public static String[] splitText(String text) {
        int length = findLength(text);
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
        
        String[] words = new String[wordCount];
        int wordIndex = 0;
        String currentWord = "";
        
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (findLength(currentWord) > 0) {
                    words[wordIndex++] = currentWord;
                    currentWord = "";
                }
            }
        }
        
        if (findLength(currentWord) > 0) {
            words[wordIndex++] = currentWord;
        }
        
        return words;
    }
    
    // Method to create 2D array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        
        return result;
    }
    
    // Method to find shortest and longest string indices
    public static int[] findShortestAndLongest(String[][] wordsWithLengths) {
        int[] result = new int[2]; // [0] = shortest index, [1] = longest index
        
        int minLength = Integer.parseInt(wordsWithLengths[0][1]);
        int maxLength = Integer.parseInt(wordsWithLengths[0][1]);
        int minIndex = 0;
        int maxIndex = 0;
        
        for (int i = 1; i < wordsWithLengths.length; i++) {
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            
            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }
            
            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }
        
        result[0] = minIndex;
        result[1] = maxIndex;
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== Find Shortest and Longest Words =====");
        System.out.print("\nEnter text: ");
        String text = sc.nextLine();
        
        // Split text into words
        String[] words = splitText(text);
        
        // Get 2D array with words and lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);
        
        // Find shortest and longest
        int[] indices = findShortestAndLongest(wordsWithLengths);
        
        // Display results
        System.out.println("\n===== Results =====");
        System.out.println("All words with lengths:");
        System.out.println("-------------------------------");
        System.out.printf("%-20s %-10s%n", "Word", "Length");
        System.out.println("-------------------------------");
        
        for (int i = 0; i < wordsWithLengths.length; i++) {
            String word = wordsWithLengths[i][0];
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            System.out.printf("%-20s %-10d%n", word, length);
        }
        System.out.println("-------------------------------");
        
        // Display shortest and longest
        System.out.println("\nShortest word: " + wordsWithLengths[indices[0]][0] + 
                         " (Length: " + wordsWithLengths[indices[0]][1] + ")");
        System.out.println("Longest word: " + wordsWithLengths[indices[1]][0] + 
                         " (Length: " + wordsWithLengths[indices[1]][1] + ")");
        
        sc.close();
    }
}
