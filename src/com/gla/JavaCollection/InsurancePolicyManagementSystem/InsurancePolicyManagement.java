package com.gla.JavaCollection.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate,
                  String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getPolicyholderName() { return policyholderName; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }
    public double getPremiumAmount() { return premiumAmount; }

    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Policy)) return false;
        Policy other = (Policy) obj;
        return this.policyNumber.equals(other.policyNumber);
    }

    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    public String toString() {
        return String.format("[%s | %s | %s | %s | $%.2f]",
                policyNumber, policyholderName, expiryDate, coverageType, premiumAmount);
    }
}

public class InsurancePolicyManagement {

    private HashSet<Policy> hashSet = new HashSet<>();
    private LinkedHashSet<Policy> linkedHashSet = new LinkedHashSet<>();
    private TreeSet<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void removePolicy(Policy policy) {
        hashSet.remove(policy);
        linkedHashSet.remove(policy);
        treeSet.remove(policy);
    }

    public void displayAllPolicies() {
        System.out.println("\n--- All Policies (HashSet - unordered) ---");
        for (Policy p : hashSet) System.out.println(p);

        System.out.println("\n--- All Policies (LinkedHashSet - insertion order) ---");
        for (Policy p : linkedHashSet) System.out.println(p);

        System.out.println("\n--- All Policies (TreeSet - sorted by expiry date) ---");
        for (Policy p : treeSet) System.out.println(p);
    }

    public void displayExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate cutoff = today.plusDays(30);
        System.out.println("\n--- Policies Expiring Within 30 Days ---");
        for (Policy p : treeSet) {
            if (!p.getExpiryDate().isBefore(today) && !p.getExpiryDate().isAfter(cutoff)) {
                System.out.println(p);
            }
        }
    }

    public void displayByCoverageType(String coverageType) {
        System.out.println("\n--- Policies with Coverage Type: " + coverageType + " ---");
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(p);
            }
        }
    }

    public void displayDuplicates(List<Policy> inputList) {
        System.out.println("\n--- Duplicate Policies (by Policy Number) ---");
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (Policy p : inputList) {
            if (!seen.add(p.getPolicyNumber())) {
                duplicates.add(p.getPolicyNumber());
            }
        }
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            for (Policy p : inputList) {
                if (duplicates.contains(p.getPolicyNumber())) {
                    System.out.println(p);
                }
            }
        }
    }

    public void comparePerformance() {
        System.out.println("\n--- Performance Comparison ---");
        int iterations = 100000;
        List<Policy> testPolicies = new ArrayList<>();
        for (int i = 0; i < iterations; i++) {
            testPolicies.add(new Policy("P" + i, "Holder" + i,
                    LocalDate.now().plusDays(i % 365), "Health", 1000 + i));
        }

        HashSet<Policy> hs = new HashSet<>();
        long start = System.nanoTime();
        for (Policy p : testPolicies) hs.add(p);
        long hsAdd = System.nanoTime() - start;

        LinkedHashSet<Policy> lhs = new LinkedHashSet<>();
        start = System.nanoTime();
        for (Policy p : testPolicies) lhs.add(p);
        long lhsAdd = System.nanoTime() - start;

        TreeSet<Policy> ts = new TreeSet<>();
        start = System.nanoTime();
        for (Policy p : testPolicies) ts.add(p);
        long tsAdd = System.nanoTime() - start;

        Policy searchTarget = testPolicies.get(50000);

        start = System.nanoTime();
        hs.contains(searchTarget);
        long hsSearch = System.nanoTime() - start;

        start = System.nanoTime();
        lhs.contains(searchTarget);
        long lhsSearch = System.nanoTime() - start;

        start = System.nanoTime();
        ts.contains(searchTarget);
        long tsSearch = System.nanoTime() - start;

        start = System.nanoTime();
        hs.remove(searchTarget);
        long hsRemove = System.nanoTime() - start;

        start = System.nanoTime();
        lhs.remove(searchTarget);
        long lhsRemove = System.nanoTime() - start;

        start = System.nanoTime();
        ts.remove(searchTarget);
        long tsRemove = System.nanoTime() - start;

        System.out.printf("%-20s %-15s %-15s %-15s%n", "Operation", "HashSet", "LinkedHashSet", "TreeSet");
        System.out.println("-".repeat(65));
        System.out.printf("%-20s %-15s %-15s %-15s%n", "Add (ms)",
                hsAdd / 1_000_000, lhsAdd / 1_000_000, tsAdd / 1_000_000);
        System.out.printf("%-20s %-15s %-15s %-15s%n", "Search (ns)",
                hsSearch, lhsSearch, tsSearch);
        System.out.printf("%-20s %-15s %-15s %-15s%n", "Remove (ns)",
                hsRemove, lhsRemove, tsRemove);
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();

        Policy p1 = new Policy("POL001", "Alice",   LocalDate.now().plusDays(10),  "Health", 1200.00);
        Policy p2 = new Policy("POL002", "Bob",     LocalDate.now().plusDays(45),  "Auto",   950.00);
        Policy p3 = new Policy("POL003", "Charlie", LocalDate.now().plusDays(20),  "Home",   1500.00);
        Policy p4 = new Policy("POL004", "Diana",   LocalDate.now().plusDays(5),   "Health", 800.00);
        Policy p5 = new Policy("POL005", "Eve",     LocalDate.now().plusDays(100), "Auto",   1100.00);
        Policy p6 = new Policy("POL006", "Frank",   LocalDate.now().plusDays(15),  "Health", 700.00);

        system.addPolicy(p1);
        system.addPolicy(p2);
        system.addPolicy(p3);
        system.addPolicy(p4);
        system.addPolicy(p5);
        system.addPolicy(p6);

        system.displayAllPolicies();
        system.displayExpiringSoon();
        system.displayByCoverageType("Health");

        List<Policy> inputWithDuplicates = new ArrayList<>(Arrays.asList(p1, p2, p3,
                new Policy("POL001", "Alice Duplicate", LocalDate.now().plusDays(10), "Health", 1200.00),
                new Policy("POL003", "Charlie Duplicate", LocalDate.now().plusDays(20), "Home", 1500.00)));
        system.displayDuplicates(inputWithDuplicates);

        system.comparePerformance();
    }
}
