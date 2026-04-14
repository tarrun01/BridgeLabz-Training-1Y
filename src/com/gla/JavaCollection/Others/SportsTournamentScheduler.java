package com.gla.JavaCollection.Others;
import java.util.*;

class Team implements Comparable<Team> {
    private String teamId;
    private String name;
    private int points;

    public Team(String teamId, String name) {
        this.teamId = teamId;
        this.name = name;
        this.points = 0;
    }

    public String getTeamId() { return teamId; }
    public String getName() { return name; }
    public int getPoints() { return points; }
    public void addPoints(int p) { this.points += p; }

    public int compareTo(Team other) {
        int cmp = other.points - this.points;
        return cmp != 0 ? cmp : this.name.compareTo(other.name);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Team)) return false;
        return this.teamId.equals(((Team) obj).teamId);
    }

    public int hashCode() { return Objects.hash(teamId); }
    public String toString() { return name + " (" + points + " pts)"; }
}

class MatchFixture {
    private Team home;
    private Team away;

    public MatchFixture(Team home, Team away) {
        this.home = home;
        this.away = away;
    }

    public Team getHome() { return home; }
    public Team getAway() { return away; }
    public String toString() { return home.getName() + " vs " + away.getName(); }
}

class MatchResultSports {
    private MatchFixture fixture;
    private Team winner;

    public MatchResultSports(MatchFixture fixture, Team winner) {
        this.fixture = fixture;
        this.winner = winner;
    }

    public String toString() { return fixture + " -> Winner: " + winner.getName(); }
}

public class SportsTournamentScheduler {

    public static void main(String[] args) {
        Set<Team> registeredTeams = new HashSet<>();
        Queue<MatchFixture> matchSchedule = new LinkedList<>();
        List<MatchResultSports> results = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>();

        Team t1 = new Team("T001", "Mumbai Indians");
        Team t2 = new Team("T002", "Chennai Super Kings");
        Team t3 = new Team("T003", "Delhi Capitals");
        Team duplicate = new Team("T001", "Mumbai-Dup");

        System.out.println("Registering Teams:");
        for (Team t : new Team[]{t1, t2, t3, duplicate}) {
            if (registeredTeams.add(t)) System.out.println("Registered: " + t.getName());
            else System.out.println("Duplicate rejected: " + t.getName());
        }

        matchSchedule.add(new MatchFixture(t1, t2));
        matchSchedule.add(new MatchFixture(t2, t3));
        matchSchedule.add(new MatchFixture(t1, t3));

        System.out.println("\nProcessing Matches:");
        while (!matchSchedule.isEmpty()) {
            MatchFixture fixture = matchSchedule.poll();
            Team winner = fixture.getHome();
            winner.addPoints(3);
            MatchResultSports result = new MatchResultSports(fixture, winner);
            results.add(result);
            System.out.println("Result: " + result);
        }

        leaderboard.addAll(registeredTeams);

        System.out.println("\nLeaderboard:");
        for (Team t : leaderboard) System.out.println(t);

        System.out.println("\nAll Match Results: " + results);
    }
}
