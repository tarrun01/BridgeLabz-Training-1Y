package com.gla.regex;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {
    public static void main(String[] args) {
        String input = "This is is a repeated repeated word test.";
        String regex = "\\b(\\w+)\\s+\\1\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        List<String> repeating = new ArrayList<>();
        while (matcher.find()) {
            repeating.add(matcher.group(1));
        }

        System.out.println("Repeating Words: " + String.join(", ", repeating));
    }
}
