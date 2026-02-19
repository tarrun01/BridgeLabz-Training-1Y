public class FixedDepositAccount extends BankAccount {
    private double interestRate;
    private int tenureMonths;
    private String maturityDate;

    public FixedDepositAccount(String accountNumber, String holderName, double balance,
                               double interestRate, int tenureMonths, String maturityDate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
        this.tenureMonths = tenureMonths;
        this.maturityDate = maturityDate;
    }

    public double getInterestRate() { return interestRate; }
    public int getTenureMonths() { return tenureMonths; }
    public String getMaturityDate() { return maturityDate; }

    public double calculateMaturityAmount() {
        return getBalance() * Math.pow(1 + interestRate / 100, tenureMonths / 12.0);
    }

    @Override
    public void displayAccountType() {
        System.out.println("--- Fixed Deposit Account ---");
        super.displayAccountType();
        System.out.printf("Interest Rate   : %.2f%%%n", interestRate);
        System.out.println("Tenure          : " + tenureMonths + " months");
        System.out.println("Maturity Date   : " + maturityDate);
        System.out.printf("Maturity Amount : ₹%.2f%n", calculateMaturityAmount());
        System.out.println();
    }
}
