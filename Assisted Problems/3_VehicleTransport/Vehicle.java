public class Vehicle {
    private double maxSpeed;
    private String fuelType;

    public Vehicle(double maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public double getMaxSpeed() { return maxSpeed; }
    public String getFuelType() { return fuelType; }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}
