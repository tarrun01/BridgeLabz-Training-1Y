public class NonVegItem extends FoodItem implements Discountable {

    private static final double NON_VEG_SURCHARGE = 20.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_SURCHARGE) * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount on Non-Veg items (includes surcharge of " + NON_VEG_SURCHARGE + " per item)";
    }

    @Override
    public void getItemDetails() {
        System.out.println("--- Non-Veg Item ---");
        super.getItemDetails();
        System.out.println(getDiscountDetails());
        System.out.println("Final Price: " + (calculateTotalPrice() - applyDiscount()));
    }
}
