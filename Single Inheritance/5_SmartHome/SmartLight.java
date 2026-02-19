public class SmartLight extends Device {
    private int brightness;
    private String color;

    public SmartLight(String deviceId, String status, int brightness, String color) {
        super(deviceId, status);
        this.brightness = brightness;
        this.color = color;
    }

    public int getBrightness() { return brightness; }
    public void setBrightness(int brightness) { this.brightness = brightness; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public void displayStatus() {
        System.out.println("--- Smart Light ---");
        super.displayStatus();
        System.out.println("Brightness : " + brightness + "%");
        System.out.println("Color      : " + color);
        System.out.println();
    }
}
