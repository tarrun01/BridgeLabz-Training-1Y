import java.util.Scanner;

public class Item {
    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item item = new Item();
        System.out.print("Enter item code: ");
        item.itemCode = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter item name: ");
        item.itemName = scanner.nextLine();
        System.out.print("Enter price: ");
        item.price = scanner.nextDouble();
        item.displayDetails();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Total cost for " + quantity + " item(s) = " + item.calculateTotalCost(quantity));
        scanner.close();
    }
}
