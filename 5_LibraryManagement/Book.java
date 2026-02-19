public class Book extends LibraryItem implements Reservable {
    private String borrowerName;
    private boolean available;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            this.available = false;
            System.out.println("Book reserved by: " + borrowerName);
        } else {
            System.out.println("Book is not available. Reserved by: " + this.borrowerName);
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
