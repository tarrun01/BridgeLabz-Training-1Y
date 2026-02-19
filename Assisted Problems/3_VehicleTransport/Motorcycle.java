public class Motorcycle extends Vehicle {
    private String type;
    private boolean hasSidecar;

    public Motorcycle(double maxSpeed, String fuelType, String type, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.type = type;
        this.hasSidecar = hasSidecar;
    }

    public String getType() { return type; }
    public boolean isHasSidecar() { return hasSidecar; }

    @Override
    public void displayInfo() {
        System.out.println("--- Motorcycle ---");
        super.displayInfo();
        System.out.println("Type      : " + type);
        System.out.println("Has Sidecar: " + hasSidecar);
        System.out.println();
    }
}
