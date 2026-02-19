public class Bike implements Vehicle {
    private String brand;
    private double ratePerDay;
    private boolean isAvailable;

    public Bike(String brand, double ratePerDay) {
        this.brand = brand;
        this.ratePerDay = ratePerDay;
        this.isAvailable = true;
    }

    @Override
    public void rent(String customerName, int days) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Bike [" + brand + "] rented to " + customerName + " for " + days + " days. Total: ₹" + (ratePerDay * days));
        } else {
            System.out.println("Bike [" + brand + "] is not available.");
        }
    }

    @Override
    public void returnVehicle(String customerName) {
        isAvailable = true;
        System.out.println("Bike [" + brand + "] returned by " + customerName);
    }

    @Override
    public String getVehicleInfo() {
        return "Bike | Brand: " + brand + " | Rate: ₹" + ratePerDay + "/day | Available: " + isAvailable;
    }
}
