public class PayPal implements PaymentProcessor {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("[PayPal] Payment of ₹" + amount + " processed successfully.");
        return true;
    }

    @Override
    public String getProviderName() {
        return "PayPal";
    }
}
