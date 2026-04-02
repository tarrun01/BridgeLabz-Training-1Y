package com.gla.WrapperLvl1;
import java.util.ArrayList;

public class WrapperInCollections {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};

        ArrayList<Double> priceList = new ArrayList<>();
        for (double price : prices) {
            priceList.add(price);
        }

        double highest = priceList.get(0);
        double total = 0;

        for (double p : priceList) {
            if (p > highest) highest = p;
            total += p;
        }

        double average = total / priceList.size();

        System.out.println("Highest price: " + highest);
        System.out.println("Average price: " + average);
    }
}
