import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount savings = new SavingsAccount("SAV-001", "Alice", 50000);
        CurrentAccount current = new CurrentAccount("CUR-002", "Bob", 100000, 20000);

        accounts.add(savings);
        accounts.add(current);

        System.out.println("========= Banking System =========\n");

        for (BankAccount account : accounts) {
            account.displayDetails();
        }

        System.out.println("--- Transactions ---");
        savings.deposit(5000);
        savings.withdraw(2000);
        savings.applyForLoan(100000);

        System.out.println();
        current.deposit(10000);
        current.withdraw(50000);
        current.applyForLoan(600000);
    }
}
