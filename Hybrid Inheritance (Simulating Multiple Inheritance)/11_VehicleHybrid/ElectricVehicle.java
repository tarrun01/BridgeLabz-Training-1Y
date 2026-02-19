public class ElectricVehicle extends Vehicle {
    private double batteryCapacityKwh;
    private double currentChargeKwh;

    public ElectricVehicle(String model, double maxSpeed, double batteryCapacityKwh, double currentChargeKwh) {
        super(model, maxSpeed);
        this.batteryCapacityKwh = batteryCapacityKwh;
        this.currentChargeKwh = currentChargeKwh;
    }

    public double getBatteryPercentage() {
        return (currentChargeKwh / batteryCapacityKwh) * 100;
    }

    public void charge(double kwh) {
        currentChargeKwh = Math.min(currentChargeKwh + kwh, batteryCapacityKwh);
        System.out.printf("[%s] Charged %.1f kWh | Battery: %.1f%%%n", getModel(), kwh, getBatteryPercentage());
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Electric Vehicle ---");
        super.displayInfo();
        System.out.printf("Battery Capacity: %.1f kWh%n", batteryCapacityKwh);
        System.out.printf("Current Charge  : %.1f%%%n", getBatteryPercentage());
        System.out.println();
    }
}
