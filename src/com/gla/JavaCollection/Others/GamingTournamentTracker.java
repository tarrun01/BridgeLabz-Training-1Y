package com.gla.JavaCollection.Others;
import java.util.*;

class Player {
    private String playerId;
    private String name;

    public Player(String playerId, String name) {
        this.playerId = playerId;
        this.name = name;
    }

    public String getPlayerId() { return playerId; }
    public String getName() { return name; }

    public boolean equals(Object obj) {
        if (!(obj instanceof Player)) return false;
        return this.playerId.equals(((Player) obj).playerId);
    }

    public int hashCode() { return Objects.hash(playerId); }
    public String toString() { return name; }
}

class Match {
    private Player p1;
    private Player p2;

    public Match(Player p1, Player p2) { this.p1 = p1; this.p2 = p2; }
    public Player getP1() { return p1; }
    public String toString() { return p1 + " vs " + p2; }
}

class MatchResult {
    private Match match;
    private Player winner;

    public MatchResult(Match match, Player winner) { this.match = match; this.winner = winner; }
    public String toString() { return match + " -> Winner: " + winner; }
}

class Score implements Comparable<Score> {
    private Player player;
    private int points;

    public Score(Player player, int points) { this.player = player; this.points = points; }
    public int compareTo(Score other) { return other.points - this.points; }
    public String toString() { return player.getName() + " -> " + points + " pts"; }
}

public class GamingTournamentTracker {
    public static void main(String[] args) {
        Set<Player> registeredPlayers = new HashSet<>();
        Queue<Match> upcomingMatches = new LinkedList<>();
        List<MatchResult> matchResults = new ArrayList<>();
        TreeSet<Score> leaderboard = new TreeSet<>();

        Player alice = new Player("P001", "Alice");
        Player bob = new Player("P002", "Bob");
        Player charlie = new Player("P003", "Charlie");
        Player duplicate = new Player("P001", "Alice-Duplicate");

        for (Player p : new Player[]{alice, bob, charlie, duplicate}) {
            if (registeredPlayers.add(p)) System.out.println("Registered: " + p);
            else System.out.println("Duplicate rejected: " + p);
        }

        upcomingMatches.add(new Match(alice, bob));
        upcomingMatches.add(new Match(bob, charlie));
        upcomingMatches.add(new Match(alice, charlie));

        Map<String, Integer> points = new HashMap<>();
        points.put("P001", 0); points.put("P002", 0); points.put("P003", 0);

        System.out.println("\nProcessing Matches:");
        while (!upcomingMatches.isEmpty()) {
            Match match = upcomingMatches.poll();
            Player winner = match.getP1();
            MatchResult result = new MatchResult(match, winner);
            matchResults.add(result);
            points.put(winner.getPlayerId(), points.get(winner.getPlayerId()) + 3);
            System.out.println("Result: " + result);
        }

        for (Player p : registeredPlayers) {
            leaderboard.add(new Score(p, points.getOrDefault(p.getPlayerId(), 0)));
        }

        System.out.println("\nLeaderboard:");
        for (Score s : leaderboard) System.out.println(s);
    }
}
