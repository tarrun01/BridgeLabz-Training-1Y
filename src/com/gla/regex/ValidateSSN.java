package com.gla.regex;
import java.util.regex.Pattern;

public class ValidateSSN {
    public static void main(String[] args) {
        String[] ssnList = {"123-45-6789", "123456789", "000-12-3456", "123-00-6789", "123-45-0000", "987-65-4321"};
        String regex = "^(?!000|666|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0000)\\d{4}$";

        for (String ssn : ssnList) {
            if (Pattern.matches(regex, ssn)) {
                System.out.println("\"" + ssn + "\" → Valid");
            } else {
                System.out.println("\"" + ssn + "\" → Invalid");
            }
        }
    }
}
