package com.gla.multithreading;

class BankAccount implements Runnable {
    String holderName;
    String accountType;
    double balance;

    BankAccount(String holderName, String accountType, double balance) {
        this.holderName = holderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("User: " + holderName +
                    " | Account Type: " + accountType +
                    " | Priority: " + Thread.currentThread().getPriority() +
                    " | Check #" + i +
                    " | Balance: $" + balance);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(holderName + " interrupted.");
            }
        }
        System.out.println(holderName + " finished all balance checks.");
    }
}

public class BankAccountSimulation {
    public static void main(String[] args) {
        BankAccount premium = new BankAccount("Alice", "Premium", 50000);
        BankAccount regular = new BankAccount("Bob", "Regular", 15000);
        BankAccount basic = new BankAccount("Charlie", "Basic", 3000);

        Thread t1 = new Thread(premium, "PremiumUser-Alice");
        Thread t2 = new Thread(regular, "RegularUser-Bob");
        Thread t3 = new Thread(basic, "BasicUser-Charlie");

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}
