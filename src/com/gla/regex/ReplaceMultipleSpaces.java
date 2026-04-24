package com.gla.regex;
public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        String input = "This   is  an   example   with   multiple    spaces.";
        String result = input.replaceAll(" +", " ");

        System.out.println("Before: \"" + input + "\"");
        System.out.println("After:  \"" + result + "\"");
    }
}
