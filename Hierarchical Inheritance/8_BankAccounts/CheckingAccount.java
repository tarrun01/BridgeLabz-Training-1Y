public class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
    private int freeTransactionsPerMonth;

    public CheckingAccount(String accountNumber, String holderName, double balance,
                           double withdrawalLimit, int freeTransactionsPerMonth) {
        super(accountNumber, holderName, balance);
        this.withdrawalLimit = withdrawalLimit;
        this.freeTransactionsPerMonth = freeTransactionsPerMonth;
    }

    public double getWithdrawalLimit() { return withdrawalLimit; }
    public int getFreeTransactionsPerMonth() { return freeTransactionsPerMonth; }

    public boolean withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal exceeds limit of ₹" + withdrawalLimit);
            return false;
        }
        if (amount > getBalance()) {
            System.out.println("Insufficient balance.");
            return false;
        }
        setBalance(getBalance() - amount);
        System.out.println("Withdrawn ₹" + amount + " | New Balance: ₹" + getBalance());
        return true;
    }

    @Override
    public void displayAccountType() {
        System.out.println("--- Checking Account ---");
        super.displayAccountType();
        System.out.printf("Withdrawal Limit      : ₹%.2f%n", withdrawalLimit);
        System.out.println("Free Transactions/Month: " + freeTransactionsPerMonth);
        System.out.println();
    }
}
