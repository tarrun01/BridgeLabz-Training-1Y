public class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Base Station";
    }

    @Override
    public double calculateFare(double distance) {
        double baseFare = 30;
        return baseFare + (getRatePerKm() * distance);
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }

    @Override
    public void getVehicleDetails() {
        System.out.println("--- Auto ---");
        super.getVehicleDetails();
        System.out.println("Location    : " + currentLocation);
    }
}
