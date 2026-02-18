public class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    LibraryBook() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
        availability = true;
    }

    LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book \"" + title + "\" has been borrowed.");
        } else {
            System.out.println("Book \"" + title + "\" is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + availability);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Clean Code", "Robert Martin", 599.0, true);
        book.display();
        book.borrowBook();
        book.display();
        book.borrowBook();
    }
}
