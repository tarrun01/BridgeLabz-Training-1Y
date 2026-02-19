public interface VehicleDashboard {
    void displaySpeed();

    default void displayBatteryPercentage() {
        System.out.println("Battery info not available for this vehicle type.");
    }
}
