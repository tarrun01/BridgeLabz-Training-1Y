package com.gla.Map.ScenarioBased;
import java.util.*;

public class WordFrequencySentence {

    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        Map<String, Integer> wordCount = new LinkedHashMap<>();
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        for (String word : words) {
            wordCount.merge(word, 1, Integer::sum);
        }

        System.out.println("Sentence: \"" + sentence + "\"");
        System.out.println("\nWord Frequencies:");
        wordCount.forEach((word, count) -> System.out.println(word + " -> " + count));
    }
}
