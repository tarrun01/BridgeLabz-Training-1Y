public class Wallet implements PaymentMethod {
    private String walletName;
    private double balance;

    public Wallet(String walletName, double balance) {
        this.walletName = walletName;
        this.balance = balance;
    }

    @Override
    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(walletName + " Wallet Payment of ₹" + amount + " successful | Remaining Balance: ₹" + balance);
            return true;
        }
        System.out.println(walletName + " Wallet Payment failed. Insufficient balance.");
        return false;
    }

    @Override
    public String getPaymentType() {
        return walletName + " Wallet";
    }
}
