public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item Name  : " + itemName);
        System.out.println("Price      : " + price);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}
