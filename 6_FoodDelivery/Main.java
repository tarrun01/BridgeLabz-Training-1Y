import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void processOrder(List<FoodItem> order) {
        double orderTotal = 0;
        for (FoodItem item : order) {
            item.getItemDetails();
            double itemTotal = item.calculateTotalPrice();
            if (item instanceof Discountable) {
                itemTotal -= ((Discountable) item).applyDiscount();
            }
            orderTotal += itemTotal;
            System.out.println();
        }
        System.out.printf("Order Total: %.2f%n", orderTotal);
    }

    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala", 180, 2));
        order.add(new NonVegItem("Chicken Biryani", 250, 1));
        order.add(new VegItem("Masala Dosa", 80, 3));

        System.out.println("========= Online Food Delivery System =========\n");
        processOrder(order);
    }
}
