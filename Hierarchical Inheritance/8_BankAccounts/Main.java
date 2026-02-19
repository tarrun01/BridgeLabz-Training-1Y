import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Bank Account Types =========\n");

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SAV-001", "Rahul Sharma", 75000, 4.5, 1000));
        accounts.add(new CheckingAccount("CHK-002", "Priya Singh", 120000, 25000, 10));
        accounts.add(new FixedDepositAccount("FD-003", "Anil Kumar", 500000, 7.5, 24, "2027-02-19"));

        for (BankAccount account : accounts) {
            account.displayAccountType();
        }

        System.out.println("--- Withdrawal Demo on Checking Account ---");
        CheckingAccount checking = (CheckingAccount) accounts.get(1);
        checking.withdraw(10000);
        checking.withdraw(30000);
    }
}
