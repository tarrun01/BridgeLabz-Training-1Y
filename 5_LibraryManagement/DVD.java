public class DVD extends LibraryItem implements Reservable {
    private boolean available;
    private String borrowerName;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            this.available = false;
            System.out.println("DVD reserved by: " + borrowerName);
        } else {
            System.out.println("DVD is not available. Reserved by: " + this.borrowerName);
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
