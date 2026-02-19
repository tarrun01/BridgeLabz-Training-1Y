public class Main {
    public static void main(String[] args) {
        System.out.println("========= Library Management System =========\n");

        Author book1 = new Author(
            "Clean Code", 2008, "Technology",
            "Robert C. Martin", "Software engineer and author known for clean coding principles.", "American"
        );

        Author book2 = new Author(
            "The Alchemist", 1988, "Fiction",
            "Paulo Coelho", "Brazilian lyricist and novelist known worldwide for inspirational stories.", "Brazilian"
        );

        Author book3 = new Author(
            "Wings of Fire", 1999, "Autobiography",
            "A.P.J. Abdul Kalam", "Former President of India and renowned aerospace scientist.", "Indian"
        );

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
