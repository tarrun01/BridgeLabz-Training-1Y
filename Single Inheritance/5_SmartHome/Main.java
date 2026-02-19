import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Smart Home Devices =========\n");

        List<Device> devices = new ArrayList<>();
        devices.add(new Thermostat("THM-001", "Active", 22.5, "Cooling"));
        devices.add(new Thermostat("THM-002", "Standby", 25.0, "Heating"));
        devices.add(new SmartLight("LGT-001", "On", 80, "Warm White"));
        devices.add(new SmartLight("LGT-002", "Off", 0, "Cool White"));

        for (Device device : devices) {
            device.displayStatus();
        }
    }
}
