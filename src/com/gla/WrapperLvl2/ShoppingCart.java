package com.gla.WrapperLvl2;
public class ShoppingCart {
    public static void main(String[] args) {
        String[] prices = {"250", "499", "99", "abc", "150"};
        int total = 0;

        for (String price : prices) {
            try {
                total += Integer.parseInt(price);
            } catch (NumberFormatException e) {
                System.out.println("Invalid price skipped: " + price);
            }
        }

        System.out.println("Total Price: " + total);
    }
}
