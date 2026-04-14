package com.gla.Map.ScenarioBased;
import java.util.*;

public class BankingBalanceTracker {

    static Map<String, Double> accounts = new HashMap<>();

    static void addAccount(String accNo, double balance) {
        accounts.put(accNo, balance);
        System.out.printf("Account added: %s -> Balance: %.2f%n", accNo, balance);
    }

    static void deposit(String accNo, double amount) {
        if (!accounts.containsKey(accNo)) { System.out.println("Account not found: " + accNo); return; }
        accounts.merge(accNo, amount, Double::sum);
        System.out.printf("Deposited %.2f to %s -> New Balance: %.2f%n", amount, accNo, accounts.get(accNo));
    }

    static void withdraw(String accNo, double amount) {
        if (!accounts.containsKey(accNo)) { System.out.println("Account not found: " + accNo); return; }
        double balance = accounts.get(accNo);
        if (amount > balance) { System.out.println("Insufficient balance for " + accNo); return; }
        accounts.put(accNo, balance - amount);
        System.out.printf("Withdrawn %.2f from %s -> New Balance: %.2f%n", amount, accNo, accounts.get(accNo));
    }

    public static void main(String[] args) {
        addAccount("ACC001", 15000);
        addAccount("ACC002", 42000);
        addAccount("ACC003", 8500);
        addAccount("ACC004", 67000);
        addAccount("ACC005", 3200);

        deposit("ACC003", 5000);
        withdraw("ACC001", 3000);
        withdraw("ACC005", 9999);

        System.out.println("\nAll Customers Sorted by Balance (Descending):");
        accounts.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));

        System.out.println("\nTop 3 Customers by Balance:");
        accounts.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(3)
                .forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));
    }
}
