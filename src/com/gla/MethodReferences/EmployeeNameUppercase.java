package com.gla.MethodReferences;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeNameUppercase {

    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList(
            "alice johnson",
            "bob smith",
            "charlie brown",
            "diana prince",
            "eve adams",
            "frank castle"
        );

        System.out.println("Original Names:");
        employeeNames.forEach(System.out::println);

        List<String> upperCasedNames = employeeNames.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("\nUppercased Names for HR Letter:");
        upperCasedNames.forEach(System.out::println);
    }
}
