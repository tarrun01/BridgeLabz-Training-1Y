package com.gla.JavaCollection.Others;
import java.util.*;

class Account {
    private String accountId;
    private String holderName;

    public Account(String accountId, String holderName) {
        this.accountId = accountId;
        this.holderName = holderName;
    }

    public String getAccountId() { return accountId; }

    public boolean equals(Object obj) {
        if (!(obj instanceof Account)) return false;
        return this.accountId.equals(((Account) obj).accountId);
    }

    public int hashCode() { return Objects.hash(accountId); }
    public String toString() { return "Account[" + accountId + ", " + holderName + "]"; }
}

class Transaction {
    private String txnId;
    private String accountId;
    private double amount;
    private String type;

    public Transaction(String txnId, String accountId, double amount, String type) {
        this.txnId = txnId;
        this.accountId = accountId;
        this.amount = amount;
        this.type = type;
    }

    public String getAccountId() { return accountId; }
    public String toString() { return "Txn[" + txnId + ", " + accountId + ", " + type + ", $" + amount + "]"; }
}

public class BankingTransactionSystem {

    public static void main(String[] args) {
        List<Transaction> transactionHistory = new ArrayList<>();
        Queue<Transaction> pendingTransactions = new LinkedList<>();
        Set<Account> validAccounts = new HashSet<>();
        Stack<Transaction> rollbackStack = new Stack<>();

        validAccounts.add(new Account("ACC001", "Alice"));
        validAccounts.add(new Account("ACC002", "Bob"));
        validAccounts.add(new Account("ACC003", "Charlie"));

        pendingTransactions.add(new Transaction("TXN001", "ACC001", 500.0, "Credit"));
        pendingTransactions.add(new Transaction("TXN002", "ACC999", 200.0, "Debit"));
        pendingTransactions.add(new Transaction("TXN003", "ACC002", 1000.0, "Credit"));
        pendingTransactions.add(new Transaction("TXN004", "ACC003", 300.0, "Debit"));

        Set<String> validAccountIds = new HashSet<>();
        for (Account a : validAccounts) validAccountIds.add(a.getAccountId());

        System.out.println("Processing Transactions:");
        while (!pendingTransactions.isEmpty()) {
            Transaction txn = pendingTransactions.poll();
            if (validAccountIds.contains(txn.getAccountId())) {
                transactionHistory.add(txn);
                rollbackStack.push(txn);
                System.out.println("Executed: " + txn);
            } else {
                System.out.println("Invalid Account - Rejected: " + txn);
            }
        }

        System.out.println("\nRolling back last transaction:");
        if (!rollbackStack.isEmpty()) {
            Transaction rolled = rollbackStack.pop();
            transactionHistory.remove(rolled);
            System.out.println("Rolled back: " + rolled);
        }

        System.out.println("\nFinal Transaction History: " + transactionHistory);
    }
}
