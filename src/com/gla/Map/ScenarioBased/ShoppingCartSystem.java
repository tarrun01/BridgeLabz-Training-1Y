package com.gla.Map.ScenarioBased;
import java.util.*;

public class ShoppingCartSystem {

    static LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

    static void addItem(String name, double price) {
        cart.put(name, price);
        System.out.println("Added to cart: " + name + " -> Rs." + price);
    }

    static void removeItem(String name) {
        if (cart.remove(name) != null) System.out.println("Removed from cart: " + name);
        else System.out.println("Item not found: " + name);
    }

    public static void main(String[] args) {
        addItem("Laptop", 45000.0);
        addItem("Mouse", 800.0);
        addItem("Keyboard", 1500.0);
        addItem("Monitor", 12000.0);
        addItem("USB Hub", 600.0);

        System.out.println("\nCart (Insertion Order):");
        cart.forEach((item, price) -> System.out.printf("%-15s Rs.%.2f%n", item, price));

        removeItem("USB Hub");

        double total = cart.values().stream().mapToDouble(Double::doubleValue).sum();
        System.out.printf("%nTotal Bill: Rs.%.2f%n", total);

        if (total > 5000) {
            double discounted = total * 0.90;
            System.out.printf("10%% Discount Applied! Final Bill: Rs.%.2f%n", discounted);
        }
    }
}
