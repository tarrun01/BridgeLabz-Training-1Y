package com.gla.StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerNamesDisplay {

    public static void main(String[] args) {
        List<String> customerNames = Arrays.asList(
            "john smith",
            "priya sharma",
            "alice johnson",
            "bob martin",
            "zara khan",
            "charlie brown",
            "diana prince",
            "mike wilson"
        );

        System.out.println("Original Names:");
        customerNames.forEach(System.out::println);

        System.out.println("\n=== Uppercased and Alphabetically Sorted ===");
        customerNames.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        System.out.println("\n=== Title Case and Sorted ===");
        customerNames.stream()
                .map(name -> Arrays.stream(name.split(" "))
                        .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                        .collect(Collectors.joining(" ")))
                .sorted()
                .forEach(System.out::println);

        System.out.println("\n=== Names Sorted Alphabetically by Last Name ===");
        customerNames.stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> {
                    String lastA = a.contains(" ") ? a.split(" ")[1] : a;
                    String lastB = b.contains(" ") ? b.split(" ")[1] : b;
                    return lastA.compareTo(lastB);
                })
                .forEach(System.out::println);
    }
}
