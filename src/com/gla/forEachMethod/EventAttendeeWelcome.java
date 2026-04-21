package com.gla.forEachMethod;
import java.util.Arrays;
import java.util.List;

public class EventAttendeeWelcome {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList(
            "Alice Johnson",
            "Bob Smith",
            "Carol White",
            "David Brown",
            "Eva Martinez"
        );

        attendees.forEach(name -> System.out.println("Welcome to the event, " + name + "!"));
    }
}
