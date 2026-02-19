public class Order {
    private String orderId;
    private String orderDate;
    private String customerName;

    public Order(String orderId, String orderDate, String customerName) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customerName = customerName;
    }

    public String getOrderId() { return orderId; }
    public String getOrderDate() { return orderDate; }
    public String getCustomerName() { return customerName; }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayInfo() {
        System.out.println("Order ID    : " + orderId);
        System.out.println("Order Date  : " + orderDate);
        System.out.println("Customer    : " + customerName);
        System.out.println("Status      : " + getOrderStatus());
    }
}
