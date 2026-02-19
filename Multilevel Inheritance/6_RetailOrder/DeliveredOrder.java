public class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;
    private String receivedBy;

    public DeliveredOrder(String orderId, String orderDate, String customerName,
                          String trackingNumber, String shippedDate, String carrier,
                          String deliveryDate, String receivedBy) {
        super(orderId, orderDate, customerName, trackingNumber, shippedDate, carrier);
        this.deliveryDate = deliveryDate;
        this.receivedBy = receivedBy;
    }

    public String getDeliveryDate() { return deliveryDate; }
    public String getReceivedBy() { return receivedBy; }

    @Override
    public String getOrderStatus() {
        return "Delivered";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Delivery Date  : " + deliveryDate);
        System.out.println("Received By    : " + receivedBy);
    }
}
