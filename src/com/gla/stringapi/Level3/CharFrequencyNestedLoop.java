package com.gla.stringapi.Level3;

import java.util.Scanner;

public class CharFrequencyNestedLoop {

    // Find frequency using nested loops, mark duplicates with '0'
    static String[] charFrequency(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[chars.length];

        // Outer loop: each character starts with frequency 1
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            // Inner loop: check for duplicates before current position
            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j] && chars[j] != '0') {
                    freq[j]++;           // increment original count
                    chars[i] = '0';      // mark duplicate to skip it
                    break;
                }
            }
        }

        // Count non-duplicate entries
        int count = 0;
        for (char c : chars) if (c != '0') count++;

        // Build result array
        String[] result = new String[count];
        char[] orig = s.toCharArray();
        int idx = 0;
        for (int i = 0; i < orig.length; i++)
            if (chars[i] != '0')
                result[idx++] = "'" + orig[i] + "' -> " + freq[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Character Frequencies:");
        for (String entry : charFrequency(s)) System.out.println(entry);
        sc.close();
    }
}
