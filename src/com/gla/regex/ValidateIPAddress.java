package com.gla.regex;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String[] ipAddresses = {"192.168.1.1", "255.255.255.255", "256.100.50.25", "192.168.1", "0.0.0.0", "300.1.1.1"};
        String octet = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        String regex = "^" + octet + "\\." + octet + "\\." + octet + "\\." + octet + "$";

        for (String ip : ipAddresses) {
            if (Pattern.matches(regex, ip)) {
                System.out.println("\"" + ip + "\" → Valid");
            } else {
                System.out.println("\"" + ip + "\" → Invalid");
            }
        }
    }
}
