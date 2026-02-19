public class Magazine extends LibraryItem implements Reservable {
    private boolean available;
    private String borrowerName;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            this.available = false;
            System.out.println("Magazine reserved by: " + borrowerName);
        } else {
            System.out.println("Magazine is not available. Reserved by: " + this.borrowerName);
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
