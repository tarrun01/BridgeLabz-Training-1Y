import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("MH-12-AB-1234", 1500, "CAR-POL-001"));
        vehicles.add(new Bike("MH-14-CD-5678", 500, "BIKE-POL-002"));
        vehicles.add(new Truck("MH-16-EF-9101", 3000, "TRUCK-POL-003"));

        int rentalDays = 5;

        System.out.println("========= Vehicle Rental System =========\n");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.printf("Rental Cost (%d days): %.2f%n", rentalDays, vehicle.calculateRentalCost(rentalDays));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println(insurable.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
