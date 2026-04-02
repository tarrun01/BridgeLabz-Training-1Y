package com.gla.WrapperLvl2;
import java.util.ArrayList;
import java.util.Objects;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] oldRatings = {4, 5, 3};

        ArrayList<Integer> newRatings = new ArrayList<>();
        newRatings.add(5);
        newRatings.add(null);
        newRatings.add(4);
        newRatings.add(null);
        newRatings.add(3);

        ArrayList<Integer> allRatings = new ArrayList<>();
        for (int r : oldRatings) {
            allRatings.add(r);
        }
        allRatings.addAll(newRatings);

        int sum = 0, count = 0;
        for (Integer r : allRatings) {
            if (Objects.nonNull(r)) {
                sum += r;
                count++;
            }
        }

        System.out.println("Total valid ratings: " + count);
        System.out.println("Average rating: " + (count > 0 ? (double) sum / count : 0));
    }
}
