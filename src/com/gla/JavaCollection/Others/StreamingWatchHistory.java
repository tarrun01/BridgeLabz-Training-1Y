package com.gla.JavaCollection.Others;
import java.util.*;

class Movie {
    private String title;
    private String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public String toString() { return "\"" + title + "\" [" + genre + "]"; }
}

public class StreamingWatchHistory {

    public static void main(String[] args) {
        Stack<Movie> watchHistory = new Stack<>();
        List<Movie> allMovies = new ArrayList<>();
        Set<String> watchedGenres = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>();

        allMovies.add(new Movie("Inception", "Sci-Fi"));
        allMovies.add(new Movie("The Dark Knight", "Action"));
        allMovies.add(new Movie("Interstellar", "Sci-Fi"));
        allMovies.add(new Movie("Parasite", "Thriller"));
        allMovies.add(new Movie("Avengers", "Action"));

        System.out.println("All Available Movies: " + allMovies);

        upNext.add(allMovies.get(0));
        upNext.add(allMovies.get(1));
        upNext.add(allMovies.get(2));
        System.out.println("\nUp Next Queue: " + upNext);

        System.out.println("\nWatching Movies:");
        while (!upNext.isEmpty()) {
            Movie current = upNext.poll();
            watchHistory.push(current);
            watchedGenres.add(current.getGenre());
            System.out.println("Watched: " + current);
        }

        System.out.println("\nWatch History (most recent first):");
        Stack<Movie> tempStack = (Stack<Movie>) watchHistory.clone();
        while (!tempStack.isEmpty()) System.out.println(" - " + tempStack.pop());

        System.out.println("\nUnique Genres Watched: " + watchedGenres);

        System.out.println("\nRecommendations based on watched genres:");
        for (Movie m : allMovies) {
            if (watchedGenres.contains(m.getGenre()) && !watchHistory.contains(m)) {
                System.out.println("Recommended: " + m);
            }
        }
    }
}
