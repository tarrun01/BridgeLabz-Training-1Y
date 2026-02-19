public class Author extends Book {
    private String authorName;
    private String bio;
    private String nationality;

    public Author(String title, int publicationYear, String genre, String authorName, String bio, String nationality) {
        super(title, publicationYear, genre);
        this.authorName = authorName;
        this.bio = bio;
        this.nationality = nationality;
    }

    public String getAuthorName() { return authorName; }
    public String getBio() { return bio; }
    public String getNationality() { return nationality; }

    @Override
    public void displayInfo() {
        System.out.println("--- Book with Author Info ---");
        super.displayInfo();
        System.out.println("Author Name : " + authorName);
        System.out.println("Nationality : " + nationality);
        System.out.println("Bio         : " + bio);
        System.out.println();
    }
}
