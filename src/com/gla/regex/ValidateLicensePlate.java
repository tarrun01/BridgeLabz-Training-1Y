package com.gla.regex;
import java.util.regex.Pattern;

public class ValidateLicensePlate {
    public static void main(String[] args) {
        String[] plates = {"AB1234", "A12345", "XY9999", "abc123", "AB12345", "CD5678"};
        String regex = "^[A-Z]{2}[0-9]{4}$";

        for (String plate : plates) {
            if (Pattern.matches(regex, plate)) {
                System.out.println("\"" + plate + "\" → Valid");
            } else {
                System.out.println("\"" + plate + "\" → Invalid");
            }
        }
    }
}
