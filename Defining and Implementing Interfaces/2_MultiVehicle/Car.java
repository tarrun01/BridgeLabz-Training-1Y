public class Car implements Vehicle {
    private String model;
    private double ratePerDay;
    private boolean isAvailable;

    public Car(String model, double ratePerDay) {
        this.model = model;
        this.ratePerDay = ratePerDay;
        this.isAvailable = true;
    }

    @Override
    public void rent(String customerName, int days) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Car [" + model + "] rented to " + customerName + " for " + days + " days. Total: ₹" + (ratePerDay * days));
        } else {
            System.out.println("Car [" + model + "] is not available.");
        }
    }

    @Override
    public void returnVehicle(String customerName) {
        isAvailable = true;
        System.out.println("Car [" + model + "] returned by " + customerName);
    }

    @Override
    public String getVehicleInfo() {
        return "Car | Model: " + model + " | Rate: ₹" + ratePerDay + "/day | Available: " + isAvailable;
    }
}
