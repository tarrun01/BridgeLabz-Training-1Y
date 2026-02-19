public class Main {
    public static void main(String[] args) {
        System.out.println("========= Digital Payment Interface =========\n");

        PaymentMethod upi = new UPI("rahul@okhdfcbank", 5000);
        PaymentMethod card = new CreditCard("4111111111111234", 50000);
        PaymentMethod wallet = new Wallet("Paytm", 1500);

        System.out.println("--- Making Payments ---");
        upi.pay(1200);
        card.pay(25000);
        wallet.pay(800);

        System.out.println("\n--- Attempting Payments Beyond Limit ---");
        upi.pay(4500);
        wallet.pay(1000);
    }
}
