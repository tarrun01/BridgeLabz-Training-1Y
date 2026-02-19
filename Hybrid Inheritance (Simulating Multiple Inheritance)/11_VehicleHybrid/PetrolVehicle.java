public class PetrolVehicle extends Vehicle implements Refuelable {
    private double tankCapacityLiters;
    private double currentFuelLiters;

    public PetrolVehicle(String model, double maxSpeed, double tankCapacityLiters, double currentFuelLiters) {
        super(model, maxSpeed);
        this.tankCapacityLiters = tankCapacityLiters;
        this.currentFuelLiters = currentFuelLiters;
    }

    @Override
    public void refuel(double liters) {
        currentFuelLiters = Math.min(currentFuelLiters + liters, tankCapacityLiters);
        System.out.printf("[%s] Refueled %.1f liters | Fuel Level: %.1f liters%n", getModel(), liters, currentFuelLiters);
    }

    @Override
    public double getFuelLevel() {
        return currentFuelLiters;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Petrol Vehicle ---");
        super.displayInfo();
        System.out.printf("Tank Capacity: %.1f liters%n", tankCapacityLiters);
        System.out.printf("Current Fuel : %.1f liters%n", currentFuelLiters);
        System.out.println();
    }
}
