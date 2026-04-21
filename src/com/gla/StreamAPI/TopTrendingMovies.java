package com.gla.StreamAPI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Movie {
    private String title;
    private double rating;
    private int releaseYear;
    private String genre;

    public Movie(String title, double rating, int releaseYear, String genre) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public String getTitle()     { return title; }
    public double getRating()    { return rating; }
    public int getReleaseYear()  { return releaseYear; }
    public String getGenre()     { return genre; }

    public String toString() {
        return String.format("%-25s Rating: %.1f  Year: %d  Genre: %s",
                title, rating, releaseYear, genre);
    }
}

public class TopTrendingMovies {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Inception",           8.8, 2010, "Sci-Fi"),
            new Movie("The Dark Knight",     9.0, 2008, "Action"),
            new Movie("Interstellar",        8.6, 2014, "Sci-Fi"),
            new Movie("Parasite",            8.5, 2019, "Thriller"),
            new Movie("Avengers: Endgame",   8.4, 2019, "Action"),
            new Movie("Oppenheimer",         8.9, 2023, "Drama"),
            new Movie("Dune",               8.0, 2021, "Sci-Fi"),
            new Movie("The Batman",          7.9, 2022, "Action"),
            new Movie("Spider-Man: NWH",     8.3, 2021, "Action"),
            new Movie("Everything Everywhere",7.8, 2022, "Comedy"),
            new Movie("Top Gun: Maverick",   8.3, 2022, "Action"),
            new Movie("Avatar: Way of Water",7.6, 2022, "Sci-Fi")
        );

        System.out.println("=== Top 5 Trending Movies (Rating >= 8.0, Sorted by Rating then Year) ===");
        List<Movie> top5 = movies.stream()
                .filter(m -> m.getRating() >= 8.0)
                .sorted(Comparator.comparingDouble(Movie::getRating).reversed()
                        .thenComparingInt(Movie::getReleaseYear).reversed())
                .limit(5)
                .collect(Collectors.toList());

        top5.forEach(System.out::println);

        System.out.println("\n=== Top 5 Most Recent Movies (Any Rating) ===");
        movies.stream()
                .sorted(Comparator.comparingInt(Movie::getReleaseYear).reversed()
                        .thenComparingDouble(Movie::getRating).reversed())
                .limit(5)
                .forEach(System.out::println);
    }
}
