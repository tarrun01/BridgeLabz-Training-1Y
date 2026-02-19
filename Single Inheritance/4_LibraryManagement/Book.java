public class Book {
    private String title;
    private int publicationYear;
    private String genre;

    public Book(String title, int publicationYear, String genre) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.genre = genre;
    }

    public String getTitle() { return title; }
    public int getPublicationYear() { return publicationYear; }
    public String getGenre() { return genre; }

    public void displayInfo() {
        System.out.println("Title           : " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Genre           : " + genre);
    }
}
