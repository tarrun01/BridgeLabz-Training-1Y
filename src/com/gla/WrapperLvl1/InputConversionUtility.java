package com.gla.WrapperLvl1;
public class InputConversionUtility {

    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        String[] testInputs = {"123", "abc", "45.6", "0"};

        for (String input : testInputs) {
            System.out.println("safeParseInt(\"" + input + "\") = " + safeParseInt(input));
        }
    }
}
