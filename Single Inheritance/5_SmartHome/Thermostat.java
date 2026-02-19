public class Thermostat extends Device {
    private double temperatureSetting;
    private String mode;

    public Thermostat(String deviceId, String status, double temperatureSetting, String mode) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
        this.mode = mode;
    }

    public double getTemperatureSetting() { return temperatureSetting; }
    public void setTemperatureSetting(double temperatureSetting) { this.temperatureSetting = temperatureSetting; }
    public String getMode() { return mode; }
    public void setMode(String mode) { this.mode = mode; }

    @Override
    public void displayStatus() {
        System.out.println("--- Thermostat ---");
        super.displayStatus();
        System.out.println("Temperature: " + temperatureSetting + "°C");
        System.out.println("Mode       : " + mode);
        System.out.println();
    }
}
