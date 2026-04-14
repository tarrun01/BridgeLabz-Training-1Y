package com.gla.JavaCollection.Others;
import java.util.*;

class Order {
    private String orderId;
    private String customerName;
    private double amount;
    private boolean failed;

    public Order(String orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        this.failed = false;
    }

    public String getOrderId() { return orderId; }
    public boolean isFailed() { return failed; }
    public void setFailed(boolean failed) { this.failed = failed; }

    public boolean equals(Object obj) {
        if (!(obj instanceof Order)) return false;
        return this.orderId.equals(((Order) obj).orderId);
    }

    public int hashCode() { return Objects.hash(orderId); }

    public String toString() {
        return "Order[" + orderId + ", " + customerName + ", $" + amount + "]";
    }
}

public class ECommerceOrderSystem {

    public static void main(String[] args) {
        List<Order> allOrders = new ArrayList<>();
        Set<Order> uniqueOrders = new HashSet<>();
        Queue<Order> processingQueue = new LinkedList<>();
        Stack<Order> failedOrders = new Stack<>();

        Order o1 = new Order("ORD001", "Alice", 250.0);
        Order o2 = new Order("ORD002", "Bob", 180.0);
        Order o3 = new Order("ORD001", "Alice", 250.0);
        Order o4 = new Order("ORD003", "Charlie", 320.0);
        Order o5 = new Order("ORD004", "Diana", 90.0);

        allOrders.add(o1); allOrders.add(o2); allOrders.add(o3);
        allOrders.add(o4); allOrders.add(o5);

        System.out.println("All Orders (with duplicates): " + allOrders);

        for (Order o : allOrders) uniqueOrders.add(o);
        System.out.println("After Removing Duplicates: " + uniqueOrders);

        for (Order o : uniqueOrders) processingQueue.add(o);

        System.out.println("\nProcessing Orders:");
        while (!processingQueue.isEmpty()) {
            Order current = processingQueue.poll();
            if (current.getOrderId().equals("ORD003")) {
                current.setFailed(true);
                failedOrders.push(current);
                System.out.println("FAILED: " + current);
            } else {
                System.out.println("Processed: " + current);
            }
        }

        System.out.println("\nRe-processing Failed Orders:");
        while (!failedOrders.isEmpty()) {
            Order retry = failedOrders.pop();
            retry.setFailed(false);
            System.out.println("Retried: " + retry);
        }
    }
}
