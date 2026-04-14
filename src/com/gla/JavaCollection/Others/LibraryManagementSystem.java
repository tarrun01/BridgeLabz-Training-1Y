package com.gla.JavaCollection.Others;
import java.util.*;

class Book {
    private String bookId;
    private String title;
    private String author;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String getBookId() { return bookId; }

    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) return false;
        return this.bookId.equals(((Book) obj).bookId);
    }

    public int hashCode() { return Objects.hash(bookId); }
    public String toString() { return "Book[" + bookId + ", \"" + title + "\", " + author + "]"; }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {
        List<Book> totalBooks = new ArrayList<>();
        Set<String> memberIds = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returnedBooks = new Stack<>();

        Book b1 = new Book("B001", "Java Programming", "James Gosling");
        Book b2 = new Book("B002", "Data Structures", "Robert Lafore");
        Book b3 = new Book("B003", "Clean Code", "Robert Martin");
        Book b4 = new Book("B004", "Design Patterns", "GoF");

        totalBooks.add(b1); totalBooks.add(b2); totalBooks.add(b3); totalBooks.add(b4);
        System.out.println("Total Books: " + totalBooks);

        System.out.println("\nRegistering Members:");
        String[] members = {"M001", "M002", "M001", "M003"};
        for (String id : members) {
            if (memberIds.add(id)) System.out.println("Registered: " + id);
            else System.out.println("Duplicate member rejected: " + id);
        }

        issueQueue.add(b1); issueQueue.add(b2); issueQueue.add(b3);

        System.out.println("\nIssuing Books:");
        while (!issueQueue.isEmpty()) {
            Book b = issueQueue.poll();
            totalBooks.remove(b);
            System.out.println("Issued: " + b);
        }

        System.out.println("\nReturning Books:");
        returnedBooks.push(b1);
        returnedBooks.push(b2);
        System.out.println("Returned: " + b1);
        System.out.println("Returned: " + b2);

        System.out.println("\nRe-issuing Most Recently Returned Book:");
        if (!returnedBooks.isEmpty()) {
            Book reissue = returnedBooks.pop();
            totalBooks.add(reissue);
            System.out.println("Re-issued: " + reissue);
        }

        System.out.println("\nBooks Available Now: " + totalBooks);
    }
}
