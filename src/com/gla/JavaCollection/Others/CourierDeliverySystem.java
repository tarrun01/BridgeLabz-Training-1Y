package com.gla.JavaCollection.Others;
import java.util.*;

class Parcel implements Comparable<Parcel> {
    private String parcelId;
    private String destination;
    private int priority;

    public Parcel(String parcelId, String destination, int priority) {
        this.parcelId = parcelId;
        this.destination = destination;
        this.priority = priority;
    }

    public String getParcelId() { return parcelId; }
    public int getPriority() { return priority; }

    public int compareTo(Parcel other) { return other.priority - this.priority; }
    public String toString() { return "Parcel[" + parcelId + ", " + destination + ", priority=" + priority + "]"; }
}

public class CourierDeliverySystem {

    public static void main(String[] args) {
        PriorityQueue<Parcel> highPriorityParcels = new PriorityQueue<>();
        Queue<Parcel> normalParcels = new LinkedList<>();
        Set<String> assignedIds = new HashSet<>();
        List<Parcel> completedDeliveries = new ArrayList<>();

        String[] ids = {"PKG001", "PKG002", "PKG003", "PKG001", "PKG004"};
        String[] destinations = {"Delhi", "Mumbai", "Pune", "Delhi-Dup", "Chennai"};
        int[] priorities = {3, 1, 5, 3, 2};

        System.out.println("Adding Parcels:");
        for (int i = 0; i < ids.length; i++) {
            if (assignedIds.add(ids[i])) {
                Parcel p = new Parcel(ids[i], destinations[i], priorities[i]);
                highPriorityParcels.add(p);
                normalParcels.add(p);
                System.out.println("Added: " + p);
            } else {
                System.out.println("Duplicate ID rejected: " + ids[i]);
            }
        }

        System.out.println("\nDispatching High-Priority Parcels First:");
        while (!highPriorityParcels.isEmpty()) {
            Parcel p = highPriorityParcels.poll();
            completedDeliveries.add(p);
            System.out.println("Dispatched: " + p);
        }

        System.out.println("\nCompleted Deliveries: " + completedDeliveries);
        System.out.println("Total Delivered: " + completedDeliveries.size());
    }
}
