public class AirConditioner implements SmartDevice {
    private int temperature;
    private boolean isOn;

    public AirConditioner(int temperature) {
        this.temperature = temperature;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("AC is now ON | Set Temperature: " + temperature + "°C");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("AC is now OFF");
    }

    @Override
    public String getDeviceName() {
        return "Air Conditioner";
    }
}
