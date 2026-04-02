package com.gla.WrapperLvl2;
public class UserInputValidation {

    public static boolean isValidAge(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] testAges = {"25", "15", "abc", "18", "-5"};

        for (String age : testAges) {
            System.out.println("Age \"" + age + "\" is valid: " + isValidAge(age));
        }
    }
}
