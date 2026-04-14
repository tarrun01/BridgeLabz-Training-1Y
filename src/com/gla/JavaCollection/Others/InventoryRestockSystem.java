package com.gla.JavaCollection.Others;
import java.util.*;

class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) return false;
        return this.name.equalsIgnoreCase(((Product) obj).name);
    }

    public int hashCode() { return Objects.hash(name.toLowerCase()); }
    public String toString() { return "Product[" + name + ", $" + price + ", stock=" + stock + "]"; }
}

public class InventoryRestockSystem {

    public static void main(String[] args) {
        Set<String> productNames = new HashSet<>();
        List<Product> inventory = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restockHistory = new Stack<>();

        String[] names = {"Rice", "Wheat", "Sugar", "Rice"};
        double[] prices = {50.0, 40.0, 60.0, 50.0};
        int[] stocks = {5, 2, 100, 5};

        System.out.println("Adding Products:");
        for (int i = 0; i < names.length; i++) {
            if (productNames.add(names[i])) {
                Product p = new Product(names[i], prices[i], stocks[i]);
                inventory.add(p);
                System.out.println("Added: " + p);
            } else {
                System.out.println("Duplicate skipped: " + names[i]);
            }
        }

        System.out.println("\nChecking Low Stock (threshold < 10):");
        for (Product p : inventory) {
            if (p.getStock() < 10) {
                restockQueue.add(p);
                System.out.println("Queued for restock: " + p);
            }
        }

        System.out.println("\nProcessing Restock Queue:");
        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.setStock(p.getStock() + 50);
            restockHistory.push(p);
            System.out.println("Restocked: " + p);
        }

        System.out.println("\nUndo Last Restock:");
        if (!restockHistory.isEmpty()) {
            Product undone = restockHistory.pop();
            undone.setStock(undone.getStock() - 50);
            System.out.println("Rolled back: " + undone);
        }

        System.out.println("\nFinal Inventory: " + inventory);
    }
}
