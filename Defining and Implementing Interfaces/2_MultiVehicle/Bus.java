public class Bus implements Vehicle {
    private String routeNumber;
    private double ratePerDay;
    private boolean isAvailable;

    public Bus(String routeNumber, double ratePerDay) {
        this.routeNumber = routeNumber;
        this.ratePerDay = ratePerDay;
        this.isAvailable = true;
    }

    @Override
    public void rent(String customerName, int days) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Bus [Route " + routeNumber + "] rented to " + customerName + " for " + days + " days. Total: ₹" + (ratePerDay * days));
        } else {
            System.out.println("Bus [Route " + routeNumber + "] is not available.");
        }
    }

    @Override
    public void returnVehicle(String customerName) {
        isAvailable = true;
        System.out.println("Bus [Route " + routeNumber + "] returned by " + customerName);
    }

    @Override
    public String getVehicleInfo() {
        return "Bus | Route: " + routeNumber + " | Rate: ₹" + ratePerDay + "/day | Available: " + isAvailable;
    }
}
