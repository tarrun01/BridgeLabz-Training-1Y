package com.gla.stringapi.Level3;

import java.util.Scanner;

public class PalindromeChecker3Methods {

    // Logic 1: Two-pointer loop approach
    static boolean isPalindromeLoop(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive approach
    static boolean isPalindromeRecursive(String s, int start, int end) {
        if (start >= end) return true;                          // base case
        if (s.charAt(start) != s.charAt(end)) return false;    // mismatch
        return isPalindromeRecursive(s, start + 1, end - 1);   // recurse inward
    }

    // Logic 3: Character array + reverse comparison
    static boolean isPalindromeArray(String s) {
        char[] original = s.toCharArray();
        char[] reversed = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
            reversed[i] = s.charAt(s.length() - 1 - i);
        for (int i = 0; i < original.length; i++)
            if (original[i] != reversed[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Logic 1 (Loop):      " + isPalindromeLoop(s));
        System.out.println("Logic 2 (Recursion): " + isPalindromeRecursive(s, 0, s.length() - 1));
        System.out.println("Logic 3 (Array):     " + isPalindromeArray(s));
    sc.close();
    }
}
