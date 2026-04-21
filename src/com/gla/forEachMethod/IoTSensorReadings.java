package com.gla.forEachMethod;
import java.util.Arrays;
import java.util.List;

public class IoTSensorReadings {
    public static void main(String[] args) {
        List<Double> sensorReadings = Arrays.asList(23.5, 78.2, 45.1, 92.4, 31.0, 88.7, 55.3, 102.1);
        double threshold = 70.0;

        sensorReadings.stream()
            .filter(reading -> reading > threshold)
            .forEach(reading -> System.out.println("Alert! High Reading: " + reading));
    }
}
