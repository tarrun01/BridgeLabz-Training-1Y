public interface PaymentProcessor {
    boolean processPayment(double amount);
    String getProviderName();

    default boolean refund(double amount) {
        System.out.println("[" + getProviderName() + "] Default refund of ₹" + amount + " initiated. Processing in 3-5 business days.");
        return true;
    }
}
