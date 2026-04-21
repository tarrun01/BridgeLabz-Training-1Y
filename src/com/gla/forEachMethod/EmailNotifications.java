package com.gla.forEachMethod;
import java.util.Arrays;
import java.util.List;

public class EmailNotifications {

    static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }

    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
            "alice@example.com",
            "bob@example.com",
            "carol@example.com",
            "david@example.com",
            "eva@example.com"
        );

        emails.forEach(email -> sendEmailNotification(email));
    }
}
