public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public void setItemId(String itemId) { this.itemId = itemId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID    : " + itemId);
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Loan Period: " + getLoanDuration() + " days");
    }
}
