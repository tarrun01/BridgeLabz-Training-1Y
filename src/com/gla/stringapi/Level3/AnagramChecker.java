package com.gla.stringapi.Level3;
import java.util.Scanner;

public class AnagramChecker {

    // Check if two strings are anagrams using frequency arrays
    static boolean isAnagram(String s1, String s2) {
        // Step 1: Lengths must be equal
        if (s1.length() != s2.length()) return false;

        // Step 2: Count frequency of each character in both strings
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }

        // Step 3: Compare frequencies
        for (int i = 0; i < 256; i++)
            if (freq1[i] != freq2[i]) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string:  ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        if (isAnagram(s1, s2))
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are Anagrams!");
        else
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are NOT Anagrams.");
    sc.close();
    }

    
}
