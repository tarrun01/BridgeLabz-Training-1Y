package com.gla.WrapperLvl1;
public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double wrapperDouble = 45.67;

        double d = wrapperDouble.doubleValue();
        int i = (int) wrapperDouble.doubleValue();

        System.out.println("Double value: " + d);
        System.out.println("Int value (cast): " + i);
    }
}
