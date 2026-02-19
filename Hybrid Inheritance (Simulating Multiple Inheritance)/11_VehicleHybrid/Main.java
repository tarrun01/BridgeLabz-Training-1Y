public class Main {
    public static void main(String[] args) {
        System.out.println("========= Vehicle Management System (Hybrid Inheritance) =========\n");

        ElectricVehicle ev1 = new ElectricVehicle("Tesla Model 3", 250, 75, 40);
        ElectricVehicle ev2 = new ElectricVehicle("Tata Nexon EV", 150, 40, 10);

        PetrolVehicle pv1 = new PetrolVehicle("Honda City", 180, 45, 20);
        PetrolVehicle pv2 = new PetrolVehicle("Toyota Fortuner", 190, 65, 30);

        System.out.println("--- Vehicle Details ---");
        ev1.displayInfo();
        ev2.displayInfo();
        pv1.displayInfo();
        pv2.displayInfo();

        System.out.println("--- Charging Electric Vehicles ---");
        ev1.charge(20);
        ev2.charge(35);

        System.out.println("\n--- Refueling Petrol Vehicles ---");
        pv1.refuel(25);
        pv2.refuel(30);

        System.out.println("\n--- Polymorphism: All Vehicles ---");
        Vehicle[] vehicles = {ev1, ev2, pv1, pv2};
        for (Vehicle v : vehicles) {
            System.out.println(v.getModel() + " | Max Speed: " + v.getMaxSpeed() + " km/h" +
                (v instanceof Refuelable ? " | Fuel: " + ((Refuelable) v).getFuelLevel() + "L" : " | Electric"));
        }
    }
}
