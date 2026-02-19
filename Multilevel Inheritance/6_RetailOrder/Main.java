public class Main {
    public static void main(String[] args) {
        System.out.println("========= Online Retail Order Management =========\n");

        Order order = new Order("ORD-1001", "2025-01-10", "Alice Johnson");
        ShippedOrder shipped = new ShippedOrder("ORD-1002", "2025-01-08", "Bob Smith",
                "TRK-4567890", "2025-01-09", "FedEx");
        DeliveredOrder delivered = new DeliveredOrder("ORD-1003", "2025-01-05", "Carol White",
                "TRK-1234567", "2025-01-06", "DHL", "2025-01-08", "Carol White");

        System.out.println("--- Order 1 ---");
        order.displayInfo();

        System.out.println("\n--- Order 2 ---");
        shipped.displayInfo();

        System.out.println("\n--- Order 3 ---");
        delivered.displayInfo();

        System.out.println("\n--- Polymorphism Demo ---");
        Order[] orders = {order, shipped, delivered};
        for (Order o : orders) {
            System.out.println("Order " + o.getOrderId() + " => Status: " + o.getOrderStatus());
        }
    }
}
