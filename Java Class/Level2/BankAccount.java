import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited " + amount + ". New balance = " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn " + amount + ". New balance = " + balance);
        }
    }

    void displayBalance() {
        System.out.println("Current balance = " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        System.out.print("Enter account holder name: ");
        account.accountHolder = scanner.nextLine();
        System.out.print("Enter account number: ");
        account.accountNumber = scanner.nextInt();
        System.out.print("Enter initial balance: ");
        account.balance = scanner.nextDouble();
        System.out.print("Enter amount to deposit: ");
        account.deposit(scanner.nextDouble());
        System.out.print("Enter amount to withdraw: ");
        account.withdraw(scanner.nextDouble());
        account.displayBalance();
        scanner.close();
    }
}
