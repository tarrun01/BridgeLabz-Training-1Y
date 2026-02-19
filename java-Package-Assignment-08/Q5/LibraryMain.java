import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibraryMain {
    public static void main(String[] args) {
        // 1. Add a new book
        System.out.println("=== Adding a New Book ===");
        Book book = new Book(1001, "Clean Code", "Robert C. Martin");
        book.displayDetails();

        // 2. Register a new member
        System.out.println("\n=== Registering a New Member ===");
        Member member = new Member(501, "Sophia Turner", "sophia@email.com");
        member.displayDetails();

        // 3. Issue the book to the member
        System.out.println("\n=== Issuing Book to Member ===");
        Transaction txn = new Transaction(9001, book, member);
        txn.issueBook();

        // Show updated availability
        System.out.println("\n=== Updated Book Status ===");
        book.displayDetails();
    }
}
