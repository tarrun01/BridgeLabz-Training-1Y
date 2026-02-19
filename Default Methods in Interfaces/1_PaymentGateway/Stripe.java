public class Stripe implements PaymentProcessor {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("[Stripe] Payment of ₹" + amount + " processed successfully.");
        return true;
    }

    @Override
    public String getProviderName() {
        return "Stripe";
    }
}
