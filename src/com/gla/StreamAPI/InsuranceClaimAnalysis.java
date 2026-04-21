package com.gla.StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class InsuranceClaim {
    private String claimId;
    private String claimType;
    private double amount;
    private String status;

    public InsuranceClaim(String claimId, String claimType, double amount, String status) {
        this.claimId = claimId;
        this.claimType = claimType;
        this.amount = amount;
        this.status = status;
    }

    public String getClaimId()   { return claimId; }
    public String getClaimType() { return claimType; }
    public double getAmount()    { return amount; }
    public String getStatus()    { return status; }

    public String toString() {
        return String.format("[%s] Type: %-10s Amount: %8.2f  Status: %s",
                claimId, claimType, amount, status);
    }
}

public class InsuranceClaimAnalysis {

    public static void main(String[] args) {
        List<InsuranceClaim> claims = Arrays.asList(
            new InsuranceClaim("C001", "Health",    15000, "Approved"),
            new InsuranceClaim("C002", "Auto",      45000, "Pending"),
            new InsuranceClaim("C003", "Health",    22000, "Approved"),
            new InsuranceClaim("C004", "Home",      80000, "Approved"),
            new InsuranceClaim("C005", "Auto",      30000, "Rejected"),
            new InsuranceClaim("C006", "Health",    18000, "Pending"),
            new InsuranceClaim("C007", "Home",      55000, "Approved"),
            new InsuranceClaim("C008", "Life",     200000, "Approved"),
            new InsuranceClaim("C009", "Auto",      60000, "Approved"),
            new InsuranceClaim("C010", "Life",     150000, "Pending"),
            new InsuranceClaim("C011", "Health",    12000, "Rejected"),
            new InsuranceClaim("C012", "Home",      95000, "Pending")
        );

        System.out.println("=== Average Claim Amount per Claim Type ===");
        Map<String, Double> avgByType = claims.stream()
                .collect(Collectors.groupingBy(InsuranceClaim::getClaimType,
                        Collectors.averagingDouble(InsuranceClaim::getAmount)));

        avgByType.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.printf("%-10s -> Avg: %.2f%n", e.getKey(), e.getValue()));

        System.out.println("\n=== Total Claim Amount per Type ===");
        claims.stream()
                .collect(Collectors.groupingBy(InsuranceClaim::getClaimType,
                        Collectors.summingDouble(InsuranceClaim::getAmount)))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.printf("%-10s -> Total: %.2f%n", e.getKey(), e.getValue()));

        System.out.println("\n=== Claim Count per Status ===");
        claims.stream()
                .collect(Collectors.groupingBy(InsuranceClaim::getStatus, Collectors.counting()))
                .forEach((status, count) -> System.out.println(status + ": " + count));

        System.out.println("\n=== Average Claim Amount per Type (Approved Only) ===");
        claims.stream()
                .filter(c -> c.getStatus().equals("Approved"))
                .collect(Collectors.groupingBy(InsuranceClaim::getClaimType,
                        Collectors.averagingDouble(InsuranceClaim::getAmount)))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.printf("%-10s -> Avg: %.2f%n", e.getKey(), e.getValue()));
    }
}
