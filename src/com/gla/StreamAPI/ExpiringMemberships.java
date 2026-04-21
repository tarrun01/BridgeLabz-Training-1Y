package com.gla.StreamAPI;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class GymMember {
    private String name;
    private String memberId;
    private LocalDate expiryDate;
    private String plan;

    public GymMember(String name, String memberId, LocalDate expiryDate, String plan) {
        this.name = name;
        this.memberId = memberId;
        this.expiryDate = expiryDate;
        this.plan = plan;
    }

    public String getName()          { return name; }
    public String getMemberId()      { return memberId; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getPlan()          { return plan; }

    public String toString() {
        return String.format("%-15s [%s]  Plan: %-10s  Expires: %s",
                name, memberId, plan, expiryDate);
    }
}

public class ExpiringMemberships {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate cutoff = today.plusDays(30);

        List<GymMember> members = Arrays.asList(
            new GymMember("Alice",   "M001", today.plusDays(10),  "Premium"),
            new GymMember("Bob",     "M002", today.plusDays(45),  "Basic"),
            new GymMember("Charlie", "M003", today.plusDays(5),   "Premium"),
            new GymMember("Diana",   "M004", today.plusDays(60),  "Basic"),
            new GymMember("Eve",     "M005", today.plusDays(20),  "Gold"),
            new GymMember("Frank",   "M006", today.minusDays(5),  "Basic"),
            new GymMember("Grace",   "M007", today.plusDays(30),  "Gold"),
            new GymMember("Henry",   "M008", today.plusDays(100), "Premium")
        );

        System.out.println("Today's Date: " + today);
        System.out.println("Alert Cutoff: " + cutoff);

        System.out.println("\n=== Members Expiring Within 30 Days ===");
        List<GymMember> expiringSoon = members.stream()
                .filter(m -> !m.getExpiryDate().isBefore(today))
                .filter(m -> !m.getExpiryDate().isAfter(cutoff))
                .sorted((a, b) -> a.getExpiryDate().compareTo(b.getExpiryDate()))
                .collect(Collectors.toList());

        expiringSoon.forEach(System.out::println);
        System.out.println("Total: " + expiringSoon.size() + " member(s)");

        System.out.println("\n=== Already Expired Members ===");
        members.stream()
                .filter(m -> m.getExpiryDate().isBefore(today))
                .forEach(System.out::println);

        System.out.println("\n=== Premium Members Expiring Soon ===");
        members.stream()
                .filter(m -> m.getPlan().equals("Premium"))
                .filter(m -> !m.getExpiryDate().isBefore(today))
                .filter(m -> !m.getExpiryDate().isAfter(cutoff))
                .forEach(System.out::println);
    }
}
