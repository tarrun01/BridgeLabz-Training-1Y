package com.gla.GenericProblemStatements;
import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class ElectronicsItem extends WarehouseItem {
    public ElectronicsItem(String name) {
        super(name);
    }
}

class GroceriesItem extends WarehouseItem {
    public GroceriesItem(String name) {
        super(name);
    }
}

class FurnitureItem extends WarehouseItem {
    public FurnitureItem(String name) {
        super(name);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem(int index) {
        return items.get(index);
    }

    public List<T> getAllItems() {
        return items;
    }
}

public class SmartWarehouse {

    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println("Item: " + item.getName() + " [" + item.getClass().getSimpleName() + "]");
        }
    }

    public static void main(String[] args) {
        Storage<ElectronicsItem> electronics = new Storage<>();
        electronics.addItem(new ElectronicsItem("TV"));
        electronics.addItem(new ElectronicsItem("Fridge"));

        Storage<GroceriesItem> groceries = new Storage<>();
        groceries.addItem(new GroceriesItem("Rice"));
        groceries.addItem(new GroceriesItem("Wheat"));

        Storage<FurnitureItem> furniture = new Storage<>();
        furniture.addItem(new FurnitureItem("Chair"));

        System.out.println("Electronics:");
        displayAll(electronics.getAllItems());

        System.out.println("Groceries:");
        displayAll(groceries.getAllItems());

        System.out.println("Furniture:");
        displayAll(furniture.getAllItems());
    }
}
