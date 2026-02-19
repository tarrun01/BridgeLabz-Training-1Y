public class ElectricCar implements VehicleDashboard {
    private String model;
    private double speed;
    private int batteryPercentage;

    public ElectricCar(String model, double speed, int batteryPercentage) {
        this.model = model;
        this.speed = speed;
        this.batteryPercentage = batteryPercentage;
    }

    @Override
    public void displaySpeed() {
        System.out.println("[" + model + "] Current Speed: " + speed + " km/h | Fuel Type: Electric");
    }

    @Override
    public void displayBatteryPercentage() {
        String status = batteryPercentage > 20 ? "Good" : "Low - Please charge soon!";
        System.out.println("[" + model + "] Battery: " + batteryPercentage + "% | Status: " + status);
    }
}
