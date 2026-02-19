public class SavingsAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

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
        return getBalance() * 3;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Savings Account ---");
        super.displayDetails();
        System.out.println("Loan Eligibility: " + calculateLoanEligibility());
        System.out.println();
    }
}
