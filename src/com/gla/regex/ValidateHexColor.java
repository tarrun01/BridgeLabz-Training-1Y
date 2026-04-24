package com.gla.regex;
import java.util.regex.Pattern;

public class ValidateHexColor {
    public static void main(String[] args) {
        String[] colors = {"#FFA500", "#ff4500", "#123", "#ZZZZZZ", "#abcdef", "#12345G"};
        String regex = "^#[0-9A-Fa-f]{6}$";

        for (String color : colors) {
            if (Pattern.matches(regex, color)) {
                System.out.println("\"" + color + "\" → Valid");
            } else {
                System.out.println("\"" + color + "\" → Invalid");
            }
        }
    }
}
