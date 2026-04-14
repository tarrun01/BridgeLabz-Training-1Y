package com.gla.Map.MapInterface;
import java.util.*;

public class WordFrequencyCounter {

    public static Map<String, Integer> countFrequency(String text) {
        Map<String, Integer> freqMap = new LinkedHashMap<>();
        String cleaned = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = cleaned.trim().split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }
        return freqMap;
    }

    public static void main(String[] args) {
        String input = "Hello world, hello Java!";
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: " + countFrequency(input));

        String input2 = "To be or not to be, that is the question.";
        System.out.println("\nInput: \"" + input2 + "\"");
        System.out.println("Output: " + countFrequency(input2));
    }
}
