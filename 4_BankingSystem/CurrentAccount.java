public class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.02;
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() { return overdraftLimit; }
    public void setOverdraftLimit(double overdraftLimit) { this.overdraftLimit = overdraftLimit; }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double loanAmount) {
        double eligibility = calculateLoanEligibility();
        if (loanAmount <= eligibility) {
            System.out.println("Loan of " + loanAmount + " approved for " + getHolderName());
        } else {
            System.out.println("Loan of " + loanAmount + " exceeds eligibility of " + eligibility);
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5 + overdraftLimit;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Current Account ---");
        super.displayDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Loan Eligibility: " + calculateLoanEligibility());
        System.out.println();
    }
}
