package com.gla.GenericProblemStatements;
import java.util.ArrayList;
import java.util.List;

class BookCategory {
    public String toString() { return "Book"; }
}

class ClothingCategory {
    public String toString() { return "Clothing"; }
}

class GadgetCategory {
    public String toString() { return "Gadget"; }
}

class MarketProduct<T> {
    private String name;
    private double price;
    private T category;

    public MarketProduct(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public T getCategory() { return category; }

    public String toString() {
        return name + " | Category: " + category + " | Price: " + price;
    }
}

public class DynamicMarketplace {

    public static <T> void applyDiscount(MarketProduct<T> product, double percentage) {
        double discounted = product.getPrice() * (1 - percentage / 100);
        product.setPrice(discounted);
        System.out.println("Discount applied to " + product.getName() + ". New price: " + discounted);
    }

    public static void main(String[] args) {
        List<MarketProduct<?>> catalog = new ArrayList<>();

        MarketProduct<BookCategory> book = new MarketProduct<>("Java Programming", 500.0, new BookCategory());
        MarketProduct<ClothingCategory> shirt = new MarketProduct<>("Cotton Shirt", 800.0, new ClothingCategory());
        MarketProduct<GadgetCategory> phone = new MarketProduct<>("Smartphone", 15000.0, new GadgetCategory());

        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        System.out.println("Catalog:");
        for (MarketProduct<?> p : catalog) {
            System.out.println(p);
        }

        applyDiscount(book, 10);
        applyDiscount(phone, 15);

        System.out.println("\nUpdated Catalog:");
        for (MarketProduct<?> p : catalog) {
            System.out.println(p);
        }
    }
}
