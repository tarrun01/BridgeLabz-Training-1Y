public class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Base Station";
    }

    @Override
    public double calculateFare(double distance) {
        double baseFare = 50;
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
        System.out.println("--- Car ---");
        super.getVehicleDetails();
        System.out.println("Location    : " + currentLocation);
    }
}
