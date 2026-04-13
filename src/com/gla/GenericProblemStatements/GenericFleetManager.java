package com.gla.GenericProblemStatements;   
import java.util.ArrayList;
import java.util.List;

class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Truck extends Vehicle {
    public Truck(String name) {
        super(name);
    }
}

class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }
}

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
        System.out.println("Added: " + vehicle.getName());
    }

    public void showFleet() {
        System.out.println("Fleet:");
        for (T v : fleet) {
            System.out.println(" - " + v.getName());
        }
    }
}

public class GenericFleetManager {
    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("Volvo FH16"));
        truckFleet.addVehicle(new Truck("Scania R500"));
        truckFleet.showFleet();

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("Yamaha R15"));
        bikeFleet.addVehicle(new Bike("Honda CBR"));
        bikeFleet.showFleet();
    }
}
