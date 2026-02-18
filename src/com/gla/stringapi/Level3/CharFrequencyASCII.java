package com.gla.stringapi.Level3;

import java.util.Scanner;

public class CharFrequencyASCII {

    // Find frequency of characters using ASCII array and return 2D String array
    static String[][] charFrequency(String s) {
        // Step 1: Count frequency using ASCII index
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        // Step 2: Count distinct characters
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++)
                if (s.charAt(i) == s.charAt(j)) { seen = true; break; }
            if (!seen) count++;
        }

        // Step 3: Store unique characters and their frequencies
        String[][] result = new String[count][2];
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++)
                if (s.charAt(i) == s.charAt(j)) { seen = true; break; }
            if (!seen) {
                result[idx][0] = String.valueOf(s.charAt(i));
                result[idx][1] = String.valueOf(freq[s.charAt(i)]);
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.printf("%-12s %-10s%n", "Character", "Frequency");
        for (String[] row : charFrequency(s))
            System.out.printf("%-12s %-10s%n", row[0], row[1]);
        sc.close();
    }
}
