package com.gla.JavaCollection.Others;
import java.util.*;

class Package {
    private String packageId;
    private String recipient;

    public Package(String packageId, String recipient) {
        this.packageId = packageId;
        this.recipient = recipient;
    }

    public String getPackageId() { return packageId; }
    public String toString() { return "Package[" + packageId + ", " + recipient + "]"; }
}

public class WarehouseDeliverySystem {

    public static void main(String[] args) {
        Queue<Package> pendingDeliveries = new LinkedList<>();
        Set<String> packageIds = new HashSet<>();
        List<Package> deliveredPackages = new ArrayList<>();
        Stack<Package> returnedPackages = new Stack<>();

        String[] ids = {"PKG001", "PKG002", "PKG003", "PKG001", "PKG004"};
        String[] recipients = {"Alice", "Bob", "Charlie", "Alice-Dup", "Diana"};

        System.out.println("Adding Packages:");
        for (int i = 0; i < ids.length; i++) {
            if (packageIds.add(ids[i])) {
                Package p = new Package(ids[i], recipients[i]);
                pendingDeliveries.add(p);
                System.out.println("Added: " + p);
            } else {
                System.out.println("Duplicate ID rejected: " + ids[i]);
            }
        }

        System.out.println("\nProcessing Deliveries:");
        while (!pendingDeliveries.isEmpty()) {
            Package p = pendingDeliveries.poll();
            if (p.getPackageId().equals("PKG003")) {
                returnedPackages.push(p);
                System.out.println("Returned/Cancelled: " + p);
            } else {
                deliveredPackages.add(p);
                System.out.println("Delivered: " + p);
            }
        }

        System.out.println("\nDelivery Summary:");
        System.out.println("Delivered: " + deliveredPackages);
        System.out.println("Returned:  " + returnedPackages);
        System.out.println("Total Delivered: " + deliveredPackages.size());
        System.out.println("Total Returned:  " + returnedPackages.size());
    }
}
