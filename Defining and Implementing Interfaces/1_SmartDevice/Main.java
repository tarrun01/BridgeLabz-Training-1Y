import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SmartDevice> devices = new ArrayList<>();
        devices.add(new Light("Living Room"));
        devices.add(new Light("Bedroom"));
        devices.add(new AirConditioner(22));
        devices.add(new Television("HBO"));

        System.out.println("========= Smart Device Control Interface =========\n");

        System.out.println("--- Turning ON all devices ---");
        for (SmartDevice device : devices) {
            device.turnOn();
        }

        System.out.println("\n--- Turning OFF all devices ---");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}
