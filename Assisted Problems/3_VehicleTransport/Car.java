public class Car extends Vehicle {
    private int seatCapacity;
    private String model;

    public Car(String model, double maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.model = model;
        this.seatCapacity = seatCapacity;
    }

    public int getSeatCapacity() { return seatCapacity; }
    public String getModel() { return model; }

    @Override
    public void displayInfo() {
        System.out.println("--- Car ---");
        System.out.println("Model        : " + model);
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println();
    }
}
