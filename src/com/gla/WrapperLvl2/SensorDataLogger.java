package com.gla.WrapperLvl2;
import java.util.ArrayList;

public class SensorDataLogger {

    static ArrayList<Double> log = new ArrayList<>();

    public static void logTemperature(double temp) {
        log.add(temp);
    }

    public static void logTemperature(Double temp) {
        log.add(temp);
    }

    public static void main(String[] args) {
        logTemperature(36.5);
        logTemperature(Double.valueOf(37.1));
        logTemperature(38.0);

        System.out.println("Logged Temperatures:");
        for (Double temp : log) {
            double t = temp;
            System.out.println(t + " °C");
        }
    }
}
