package com.gla.regex;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static void main(String[] args) {
        String[] cards = {"4111111111111111", "5500000000000004", "3714496353984312", "6011111111111117", "41111111111111", "5111111111111111"};
        String visaRegex = "^4[0-9]{15}$";
        String masterCardRegex = "^5[0-9]{15}$";

        for (String card : cards) {
            if (Pattern.matches(visaRegex, card)) {
                System.out.println("\"" + card + "\" → Valid Visa Card");
            } else if (Pattern.matches(masterCardRegex, card)) {
                System.out.println("\"" + card + "\" → Valid MasterCard");
            } else {
                System.out.println("\"" + card + "\" → Invalid Card");
            }
        }
    }
}
