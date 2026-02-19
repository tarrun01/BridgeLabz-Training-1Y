public class Television implements SmartDevice {
    private String channel;
    private boolean isOn;

    public Television(String channel) {
        this.channel = channel;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("TV is now ON | Channel: " + channel);
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("TV is now OFF");
    }

    @Override
    public String getDeviceName() {
        return "Television";
    }
}
