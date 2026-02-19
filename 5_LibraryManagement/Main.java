import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        Book book = new Book("B001", "Clean Code", "Robert C. Martin");
        Magazine magazine = new Magazine("M001", "National Geographic", "Various");
        DVD dvd = new DVD("D001", "Inception", "Christopher Nolan");

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        System.out.println("========= Library Management System =========\n");

        for (LibraryItem item : items) {
            item.getItemDetails();
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Available  : " + reservable.checkAvailability());
            }
            System.out.println();
        }

        System.out.println("--- Reservation Demo ---");
        book.reserveItem("John Doe");
        book.reserveItem("Jane Doe");
        magazine.reserveItem("Alice");
        dvd.reserveItem("Bob");
    }
}
