package com.gla.regex;
import java.util.Arrays;
import java.util.List;

public class CensorBadWords {
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";
        List<String> badWords = Arrays.asList("damn", "stupid");

        String result = input;
        for (String word : badWords) {
            result = result.replaceAll("(?i)\\b" + word + "\\b", "****");
        }

        System.out.println("Before: \"" + input + "\"");
        System.out.println("After:  \"" + result + "\"");
    }
}
