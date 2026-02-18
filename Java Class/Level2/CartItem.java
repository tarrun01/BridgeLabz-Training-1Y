import java.util.Scanner;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double itemPrice, int qty) {
        itemName = name;
        price = itemPrice;
        quantity = qty;
        System.out.println("Added " + qty + " x " + name + " to cart.");
    }

    void removeItem() {
        System.out.println("Removed " + itemName + " from cart.");
        itemName = "";
        price = 0;
        quantity = 0;
    }

    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total cost = " + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CartItem cart = new CartItem();
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();
        cart.addItem(name, price, qty);
        cart.displayTotalCost();
        cart.removeItem();
        scanner.close();
    }
}
