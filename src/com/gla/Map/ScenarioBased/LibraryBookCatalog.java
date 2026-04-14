package com.gla.Map.ScenarioBased;
import java.util.*;

public class LibraryBookCatalog {

    static Map<String, String> catalog = new TreeMap<>();

    static void addBook(String isbn, String title) {
        catalog.put(isbn, title);
        System.out.println("Added: [" + isbn + "] " + title);
    }

    static void searchByISBN(String isbn) {
        System.out.println("Search ISBN " + isbn + ": " +
                catalog.getOrDefault(isbn, "Book not found"));
    }

    static void removeBook(String isbn) {
        if (catalog.remove(isbn) != null) System.out.println("Removed ISBN: " + isbn);
        else System.out.println("ISBN not found: " + isbn);
    }

    static void searchByTitle(String title) {
        System.out.println("Searching by title \"" + title + "\":");
        boolean found = false;
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(title)) {
                System.out.println("Found -> ISBN: " + entry.getKey());
                found = true;
            }
        }
        if (!found) System.out.println("No book found with that title.");
    }

    public static void main(String[] args) {
        addBook("978-0132350884", "Clean Code");
        addBook("978-0201633610", "Design Patterns");
        addBook("978-0134685991", "Effective Java");
        addBook("978-1491950357", "Java in a Nutshell");
        addBook("978-0596007126", "Head First Java");

        searchByISBN("978-0134685991");
        searchByISBN("978-9999999999");

        removeBook("978-0201633610");

        System.out.println("\nAll Books (sorted by ISBN):");
        catalog.forEach((isbn, title) -> System.out.println(isbn + " -> " + title));

        searchByTitle("Clean Code");
        searchByTitle("Unknown Book");
    }
}
