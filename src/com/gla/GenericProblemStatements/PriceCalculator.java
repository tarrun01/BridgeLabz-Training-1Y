package com.gla.GenericProblemStatements;
import java.util.Arrays;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class Mobile extends Product {
    public Mobile(String name, double price) {
        super(name, price);
    }
}

class Laptop extends Product {
    public Laptop(String name, double price) {
        super(name, price);
    }
}

public class PriceCalculator {

    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile("iPhone", 999.99), new Mobile("Samsung", 799.99));
        System.out.println("Mobile total: " + calculateTotal(mobiles));

        List<Laptop> laptops = Arrays.asList(new Laptop("Dell", 1200.00), new Laptop("HP", 950.00));
        System.out.println("Laptop total: " + calculateTotal(laptops));
    }
}
