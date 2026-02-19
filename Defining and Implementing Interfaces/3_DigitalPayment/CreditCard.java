public class CreditCard implements PaymentMethod {
    private String cardNumber;
    private double creditLimit;
    private double usedAmount;

    public CreditCard(String cardNumber, double creditLimit) {
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
        this.usedAmount = 0;
    }

    @Override
    public boolean pay(double amount) {
        if ((creditLimit - usedAmount) >= amount) {
            usedAmount += amount;
            System.out.println("Credit Card Payment of ₹" + amount + " successful | Card: XXXX-" + cardNumber.substring(cardNumber.length() - 4) + " | Available Limit: ₹" + (creditLimit - usedAmount));
            return true;
        }
        System.out.println("Credit Card Payment failed. Credit limit exceeded.");
        return false;
    }

    @Override
    public String getPaymentType() {
        return "Credit Card (XXXX-" + cardNumber.substring(cardNumber.length() - 4) + ")";
    }
}
