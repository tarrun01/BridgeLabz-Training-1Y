import java.util.Scanner;

// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // Withdraw method that throws exceptions
    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class Problem10_BankTransactionSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();
            
            BankAccount account = new BankAccount(initialBalance);
            
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            
            account.withdraw(amount);
            
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
