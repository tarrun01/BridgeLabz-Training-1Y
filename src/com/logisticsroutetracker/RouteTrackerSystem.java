package com.logisticsroutetracker;

public class RouteTrackerSystem {

    public static void main(String[] args) {

        Driver driver = new Driver("D1204", "Kavita Nair");

        // Delay = 10 min → penalty = 10 * 2 = 20.0
        driver.addCheckpoint(new DeliveryCheckpoint("CP001", "Warehouse A", 30.0, 30, 40));

        // Delay = 0 → On Time → penalty = 0.0
        driver.addCheckpoint(new FuelCheckpoint("CP002", "Pump 12", 20.0, 15, 15));

        // Delay = 35 min → delay > 30 → penalty = 35 * 0.5 = 2.5
        driver.addCheckpoint(new RestCheckpoint("CP003", "Motel X", 40.0, 25, 60));

        // Delay = 15 min → penalty = 15 * 2 = 30.0
        driver.addCheckpoint(new DeliveryCheckpoint("CP004", "Client Hub", 30.0, 45, 60));

        System.out.println("===========================================");
        driver.printRouteSummary();
        System.out.println("===========================================");

        System.out.println();

        // Demo: find a checkpoint
        Checkpoint found = driver.findCheckpoint("CP002");
        if (found != null) {
            System.out.println("Found: " + found.getType() + " at " + found.getLocationName());
        }

        System.out.println();

        // Demo: remove a critical checkpoint and re-check consistency
        System.out.println("Removing FuelCheckpoint (CP002)...");
        driver.removeCheckpoint("CP002");
        boolean consistent = driver.getRouteHistory().consistencyCheck();
        System.out.println("Consistency after removal: " +
                (consistent ? "All required checkpoints present"
                            : "FAILED – Missing critical checkpoints"));
    }
}
