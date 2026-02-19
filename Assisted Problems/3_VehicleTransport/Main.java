public class Main {
    public static void main(String[] args) {
        System.out.println("========= Vehicle and Transport System =========\n");

        Vehicle[] vehicles = {
            new Car("Toyota Camry", 180, "Petrol", 5),
            new Truck(120, "Diesel", 15.5, 6),
            new Motorcycle(200, "Petrol", "Sport Bike", false)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}
