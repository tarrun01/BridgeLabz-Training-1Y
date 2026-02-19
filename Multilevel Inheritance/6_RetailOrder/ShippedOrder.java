public class ShippedOrder extends Order {
    private String trackingNumber;
    private String shippedDate;
    private String carrier;

    public ShippedOrder(String orderId, String orderDate, String customerName,
                        String trackingNumber, String shippedDate, String carrier) {
        super(orderId, orderDate, customerName);
        this.trackingNumber = trackingNumber;
        this.shippedDate = shippedDate;
        this.carrier = carrier;
    }

    public String getTrackingNumber() { return trackingNumber; }
    public String getShippedDate() { return shippedDate; }
    public String getCarrier() { return carrier; }

    @Override
    public String getOrderStatus() {
        return "Shipped";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Shipped Date   : " + shippedDate);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Carrier        : " + carrier);
    }
}
