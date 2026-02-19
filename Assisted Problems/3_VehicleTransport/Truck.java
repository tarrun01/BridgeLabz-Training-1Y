public class Truck extends Vehicle {
    private double payloadCapacityTons;
    private int numberOfAxles;

    public Truck(double maxSpeed, String fuelType, double payloadCapacityTons, int numberOfAxles) {
        super(maxSpeed, fuelType);
        this.payloadCapacityTons = payloadCapacityTons;
        this.numberOfAxles = numberOfAxles;
    }

    public double getPayloadCapacityTons() { return payloadCapacityTons; }
    public int getNumberOfAxles() { return numberOfAxles; }

    @Override
    public void displayInfo() {
        System.out.println("--- Truck ---");
        super.displayInfo();
        System.out.println("Payload Capacity: " + payloadCapacityTons + " tons");
        System.out.println("Number of Axles : " + numberOfAxles);
        System.out.println();
    }
}
