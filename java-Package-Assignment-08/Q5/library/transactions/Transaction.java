package library.transactions;

import library.books.Book;
import library.members.Member;
import java.time.LocalDate;

public class Transaction {
    private int transactionId;
    private Book book;
    private Member member;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public Transaction(int transactionId, Book book, Member member) {
        this.transactionId = transactionId;
        this.book = book;
        this.member = member;
        this.issueDate = LocalDate.now();
        this.returnDate = issueDate.plusDays(14);
    }

    public void issueBook() {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book \"" + book.getTitle() + "\" issued to " + member.getName());
            System.out.println("Issue Date  : " + issueDate);
            System.out.println("Return By   : " + returnDate);
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" is currently not available.");
        }
    }

    public void returnBook() {
        book.setAvailable(true);
        System.out.println("Book \"" + book.getTitle() + "\" returned by " + member.getName());
        System.out.println("Return Date : " + LocalDate.now());
    }
}
