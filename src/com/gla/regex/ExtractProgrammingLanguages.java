package com.gla.regex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "Go", "C\\+\\+", "Ruby", "Kotlin", "Swift");

        List<String> found = new ArrayList<>();
        for (String lang : languages) {
            Pattern pattern = Pattern.compile("\\b" + lang + "\\b");
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                found.add(matcher.group());
            }
        }

        System.out.println("Extracted Languages: " + String.join(", ", found));
    }
}
