package com.gla.stringapi.Level3;

import java.util.Scanner;

public class FirstNonRepeatingChar {

    // Find first non-repeating character using ASCII frequency array
    static char firstNonRepeating(String s) {
        int[] freq = new int[256];
        // Count frequency of each character
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;
        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++)
            if (freq[s.charAt(i)] == 1) return s.charAt(i);
        return '\0'; // no non-repeating character found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        char result = firstNonRepeating(s);
        if (result == '\0')
            System.out.println("No non-repeating character found.");
        else
            System.out.println("First non-repeating character: " + result);
        sc.close();
    }
}
