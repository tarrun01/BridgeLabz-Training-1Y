package com.gla.regex;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> values = new ArrayList<>();
        while (matcher.find()) {
            values.add(matcher.group());
        }

        System.out.println("Extracted Currency Values: " + String.join(", ", values));
    }
}
