package com.gla.JavaCollection.Others;
import java.util.*;

class Driver {
    private String driverId;
    private String name;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Driver)) return false;
        return this.driverId.equals(((Driver) obj).driverId);
    }

    public int hashCode() { return Objects.hash(driverId); }
    public String toString() { return "Driver[" + driverId + ", " + name + "]"; }
}

class RideRequest implements Comparable<RideRequest> {
    private String requestId;
    private String passengerName;
    private int priority;

    public RideRequest(String requestId, String passengerName, int priority) {
        this.requestId = requestId;
        this.passengerName = passengerName;
        this.priority = priority;
    }

    public int getPriority() { return priority; }
    public int compareTo(RideRequest other) { return other.priority - this.priority; }
    public String toString() { return "Ride[" + requestId + ", " + passengerName + ", priority=" + priority + "]"; }
}

class Ride {
    private RideRequest request;
    private Driver driver;

    public Ride(RideRequest request, Driver driver) {
        this.request = request;
        this.driver = driver;
    }

    public String toString() { return request + " assigned to " + driver; }
}

public class RideSharingSystem {

    public static void main(String[] args) {
        Queue<RideRequest> pendingRequests = new LinkedList<>();
        PriorityQueue<RideRequest> priorityRequests = new PriorityQueue<>();
        Set<Driver> availableDrivers = new HashSet<>();
        List<Ride> completedRides = new ArrayList<>();

        availableDrivers.add(new Driver("D001", "Ramesh"));
        availableDrivers.add(new Driver("D002", "Suresh"));
        availableDrivers.add(new Driver("D003", "Mahesh"));

        RideRequest r1 = new RideRequest("R001", "Alice", 1);
        RideRequest r2 = new RideRequest("R002", "Bob", 3);
        RideRequest r3 = new RideRequest("R003", "Charlie", 2);

        pendingRequests.add(r1); pendingRequests.add(r2); pendingRequests.add(r3);
        priorityRequests.add(r1); priorityRequests.add(r2); priorityRequests.add(r3);

        System.out.println("Normal Queue Processing:");
        Iterator<Driver> driverIterator = availableDrivers.iterator();
        while (!pendingRequests.isEmpty() && driverIterator.hasNext()) {
            RideRequest req = pendingRequests.poll();
            Driver driver = driverIterator.next();
            Ride ride = new Ride(req, driver);
            completedRides.add(ride);
            System.out.println("Assigned: " + ride);
        }

        System.out.println("\nPriority Queue Processing:");
        while (!priorityRequests.isEmpty()) {
            System.out.println("High-Priority Request: " + priorityRequests.poll());
        }

        System.out.println("\nCompleted Rides History: " + completedRides);
    }
}
