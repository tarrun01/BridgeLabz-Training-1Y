package com.gla.Map.ScenarioBased;
import java.util.*;

public class InventoryManagement {

    static Map<String, Integer> inventory = new HashMap<>();

    static void addProduct(String name, int qty) {
        inventory.put(name, qty);
        System.out.println("Added: " + name + " (qty=" + qty + ")");
    }

    static void sell(String name, int qty) {
        if (!inventory.containsKey(name)) {
            System.out.println("Not stocked: " + name);
            return;
        }
        int updated = inventory.get(name) - qty;
        inventory.put(name, Math.max(updated, 0));
        System.out.println("Sold " + qty + " of " + name + " -> remaining: " + inventory.get(name));
    }

    static void restock(String name, int qty) {
        inventory.merge(name, qty, Integer::sum);
        System.out.println("Restocked " + name + " -> new qty: " + inventory.get(name));
    }

    static void query(String name) {
        if (!inventory.containsKey(name)) System.out.println(name + ": not stocked");
        else System.out.println(name + ": " + inventory.get(name) + " units remaining");
    }

    public static void main(String[] args) {
        addProduct("Rice", 50);
        addProduct("Wheat", 30);
        addProduct("Sugar", 20);
        addProduct("Oil", 15);

        sell("Rice", 50);
        sell("Sugar", 25);
        restock("Wheat", 20);
        restock("Oil", 10);

        query("Rice");
        query("Biscuits");

        System.out.println("\nOut of Stock Products:");
        inventory.entrySet().stream()
                .filter(e -> e.getValue() == 0)
                .forEach(e -> System.out.println(" - " + e.getKey()));
    }
}
