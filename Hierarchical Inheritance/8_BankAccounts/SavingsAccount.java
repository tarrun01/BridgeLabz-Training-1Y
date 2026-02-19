public class SavingsAccount extends BankAccount {
    private double interestRate;
    private double minimumBalance;

    public SavingsAccount(String accountNumber, String holderName, double balance,
                          double interestRate, double minimumBalance) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    public double getInterestRate() { return interestRate; }
    public double getMinimumBalance() { return minimumBalance; }

    public double calculateAnnualInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void displayAccountType() {
        System.out.println("--- Savings Account ---");
        super.displayAccountType();
        System.out.printf("Interest Rate    : %.2f%%%n", interestRate);
        System.out.printf("Minimum Balance  : ₹%.2f%n", minimumBalance);
        System.out.printf("Annual Interest  : ₹%.2f%n", calculateAnnualInterest());
        System.out.println();
    }
}
