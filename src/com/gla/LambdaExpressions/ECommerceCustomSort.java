package com.gla.LambdaExpressions;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Product {
    private String name;
    private double price;
    private double rating;
    private double discountPercent;

    public Product(String name, double price, double rating, double discountPercent) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discountPercent = discountPercent;
    }

    public String getName()           { return name; }
    public double getPrice()          { return price; }
    public double getRating()         { return rating; }
    public double getDiscountPercent(){ return discountPercent; }

    public String toString() {
        return String.format("%-20s Price: %7.2f  Rating: %.1f  Discount: %.0f%%",
                name, price, rating, discountPercent);
    }
}

public class ECommerceCustomSort {

    static void printSorted(List<Product> products, Comparator<Product> comparator, String label) {
        System.out.println("\n=== " + label + " ===");
        products.stream().sorted(comparator).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop",        75000, 4.5, 10),
            new Product("Smartphone",    25000, 4.7, 20),
            new Product("Headphones",     3500, 4.2,  5),
            new Product("Smartwatch",    15000, 4.6, 15),
            new Product("Tablet",        35000, 4.3, 25),
            new Product("Keyboard",       2000, 4.0,  8)
        );

        Comparator<Product> byPriceLowToHigh  = Comparator.comparingDouble(Product::getPrice);
        Comparator<Product> byPriceHighToLow  = Comparator.comparingDouble(Product::getPrice).reversed();
        Comparator<Product> byRating          = Comparator.comparingDouble(Product::getRating).reversed();
        Comparator<Product> byDiscount        = Comparator.comparingDouble(Product::getDiscountPercent).reversed();
        Comparator<Product> byPriceThenRating = Comparator.comparingDouble(Product::getPrice)
                                                          .thenComparingDouble(Product::getRating).reversed();

        printSorted(products, byPriceLowToHigh,  "Sort by Price: Low to High");
        printSorted(products, byPriceHighToLow,  "Sort by Price: High to Low");
        printSorted(products, byRating,           "Sort by Rating: High to Low");
        printSorted(products, byDiscount,         "Sort by Discount: Highest First");
        printSorted(products, byPriceThenRating,  "Sort by Price then Rating");
    }
}
