package com.gla.GenericProblemStatements;
import java.util.ArrayList;
import java.util.List;

class Electronics {
    private String name;

    public Electronics(String name) {
        this.name = name;
    }

    public String toString() {
        return "Electronics: " + name;
    }
}

class Clothing {
    private String name;

    public Clothing(String name) {
        this.name = name;
    }

    public String toString() {
        return "Clothing: " + name;
    }
}

class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
        System.out.println("Added: " + item);
    }

    public void removeItem(T item) {
        items.remove(item);
        System.out.println("Removed: " + item);
    }

    public void displayItems() {
        System.out.println("Cart items: " + items);
    }
}

public class GenericCart {
    public static void main(String[] args) {
        Cart<Electronics> electronicCart = new Cart<>();
        electronicCart.addItem(new Electronics("Laptop"));
        electronicCart.addItem(new Electronics("Phone"));
        electronicCart.displayItems();

        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing("T-Shirt"));
        clothingCart.addItem(new Clothing("Jeans"));
        clothingCart.displayItems();
    }
}
