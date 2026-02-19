import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Smart Vehicle Dashboard =========\n");

        List<VehicleDashboard> vehicles = Arrays.asList(
            new PetrolCar("Honda City", 80.5),
            new ElectricCar("Tesla Model 3", 110.0, 75),
            new ElectricCar("Tata Nexon EV", 60.0, 15),
            new PetrolCar("Toyota Corolla", 95.0)
        );

        for (VehicleDashboard vehicle : vehicles) {
            vehicle.displaySpeed();
            vehicle.displayBatteryPercentage();
            System.out.println();
        }
    }
}
