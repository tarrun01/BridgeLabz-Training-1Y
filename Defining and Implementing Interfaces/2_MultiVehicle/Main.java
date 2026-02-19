import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(new Car("Toyota Innova", 2500));
        fleet.add(new Bike("Royal Enfield", 700));
        fleet.add(new Bus("MH-101", 8000));

        System.out.println("========= Multi-Vehicle Rental System =========\n");

        System.out.println("--- Available Fleet ---");
        for (Vehicle v : fleet) {
            System.out.println(v.getVehicleInfo());
        }

        System.out.println("\n--- Renting Vehicles ---");
        fleet.get(0).rent("Alice", 3);
        fleet.get(1).rent("Bob", 2);
        fleet.get(2).rent("City Tours Co.", 5);

        System.out.println("\n--- Attempting to rent already rented vehicle ---");
        fleet.get(0).rent("Charlie", 1);

        System.out.println("\n--- Returning Vehicles ---");
        fleet.get(0).returnVehicle("Alice");
        fleet.get(1).returnVehicle("Bob");
    }
}
