package com.gla.Map.ScenarioBased;
import java.util.*;

public class ElectionVoteCounter {

    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        String[] ballots = {"Alice", "Bob", "Alice", "Charlie", "Bob",
                            "Alice", "Charlie", "Bob", "Alice", "Charlie"};

        for (String candidate : ballots) {
            votes.merge(candidate, 1, Integer::sum);
        }

        System.out.println("Vote Counts:");
        votes.forEach((candidate, count) ->
                System.out.println(candidate + ": " + count + " votes"));

        String winner = Collections.max(votes.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\nWinner: " + winner + " with " + votes.get(winner) + " votes");

        int total = votes.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total Votes Cast: " + total);
    }
}
