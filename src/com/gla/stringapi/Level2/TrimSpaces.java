package com.gla.stringapi.Level2;
import java.util.Scanner;

public class TrimSpaces {
    
    // Method to find start and end points without spaces
    public static int[] trimSpaces(String text) {
        int[] points = new int[2]; // [0] = start, [1] = end
        
        int start = 0;
        int end = text.length() - 1;
        
        // Find start point (skip leading spaces)
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }
        
        // Find end point (skip trailing spaces)
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }
        
        points[0] = start;
        points[1] = end + 1; // end is exclusive for substring
        
        return points;
    }
    
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
        
        System.out.println("===== Trim Leading and Trailing Spaces =====");
        System.out.print("\nEnter text with spaces: ");
        String text = sc.nextLine();
        
        // Get trim points
        int[] points = trimSpaces(text);
        
        // Create trimmed string using substring method
        String trimmedCustom = createSubstring(text, points[0], points[1]);
        
        // Use built-in trim() method
        String trimmedBuiltIn = text.trim();
        
        // Compare both results
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
        
        // Display results
        System.out.println("\n===== Results =====");
        System.out.println("Original text: [" + text + "]");
        System.out.println("Length: " + text.length());
        System.out.println("\nTrimmed using custom method: [" + trimmedCustom + "]");
        System.out.println("Length: " + trimmedCustom.length());
        System.out.println("\nTrimmed using trim() method: [" + trimmedBuiltIn + "]");
        System.out.println("Length: " + trimmedBuiltIn.length());
        System.out.println("\nBoth methods match: " + areEqual);
        System.out.println("Start index: " + points[0]);
        System.out.println("End index: " + points[1]);
        
        sc.close();
    }
}
