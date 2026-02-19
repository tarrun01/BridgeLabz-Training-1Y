import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void calculateFares(List<Vehicle> vehicles, double distance) {
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.printf("Fare for %.1f km: %.2f%n%n", distance, vehicle.calculateFare(distance));
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("CAR-001", "Ramesh Kumar", 12);
        car.updateLocation("MG Road");

        Bike bike = new Bike("BIKE-002", "Suresh Patel", 8);
        bike.updateLocation("Koramangala");

        Auto auto = new Auto("AUTO-003", "Mahesh Rao", 10);
        auto.updateLocation("Indiranagar");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        System.out.println("========= Ride-Hailing Application =========\n");
        double tripDistance = 15.0;
        System.out.println("Trip Distance: " + tripDistance + " km\n");
        calculateFares(vehicles, tripDistance);
    }
}
