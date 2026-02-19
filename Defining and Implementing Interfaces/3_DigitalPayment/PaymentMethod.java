public interface PaymentMethod {
    boolean pay(double amount);
    String getPaymentType();
}
