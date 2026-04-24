package com.gla.regex;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        String[] usernames = {"user_123", "123user", "us", "hello_world", "John_Doe99", "toolongusername123456"};
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        for (String username : usernames) {
            if (Pattern.matches(regex, username)) {
                System.out.println("\"" + username + "\" → Valid");
            } else {
                System.out.println("\"" + username + "\" → Invalid");
            }
        }
    }
}
