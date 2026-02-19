public class Razorpay implements PaymentProcessor {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("[Razorpay] Payment of ₹" + amount + " processed successfully.");
        return true;
    }

    @Override
    public String getProviderName() {
        return "Razorpay";
    }

    @Override
    public boolean refund(double amount) {
        System.out.println("[Razorpay] Instant refund of ₹" + amount + " processed. Credited in 1 hour.");
        return true;
    }
}
