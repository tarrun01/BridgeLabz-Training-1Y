import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Payment Gateway Integration =========\n");

        List<PaymentProcessor> providers = Arrays.asList(new Razorpay(), new PayPal(), new Stripe());

        System.out.println("--- Processing Payments ---");
        for (PaymentProcessor provider : providers) {
            provider.processPayment(5000);
        }

        System.out.println("\n--- Processing Refunds (default method for PayPal & Stripe) ---");
        for (PaymentProcessor provider : providers) {
            provider.refund(5000);
        }
    }
}
