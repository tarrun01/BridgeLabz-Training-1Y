public class Vehicle {
    private double maxSpeed;
    private String model;

    public Vehicle(String model, double maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() { return model; }
    public double getMaxSpeed() { return maxSpeed; }

    public void displayInfo() {
        System.out.println("Model    : " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
