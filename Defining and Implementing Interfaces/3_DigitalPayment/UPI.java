public class UPI implements PaymentMethod {
    private String upiId;
    private double balance;

    public UPI(String upiId, double balance) {
        this.upiId = upiId;
        this.balance = balance;
    }

    @Override
    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("UPI Payment of ₹" + amount + " successful via " + upiId + " | Remaining Balance: ₹" + balance);
            return true;
        }
        System.out.println("UPI Payment failed. Insufficient balance.");
        return false;
    }

    @Override
    public String getPaymentType() {
        return "UPI (" + upiId + ")";
    }
}
