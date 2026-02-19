import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void checkTemperature(List<Double> readings, Predicate<Double> alertCondition, double threshold) {
        System.out.println("Temperature threshold: " + threshold + "°C\n");
        for (Double temp : readings) {
            System.out.print("Reading: " + temp + "°C -> ");
            if (alertCondition.test(temp)) {
                System.out.println("ALERT! Temperature exceeded threshold.");
            } else {
                System.out.println("Normal.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("========= Temperature Alert System =========\n");

        double threshold = 38.0;
        Predicate<Double> isOverheating = temp -> temp > threshold;

        List<Double> sensorReadings = Arrays.asList(35.5, 37.0, 38.5, 40.2, 36.8, 41.0, 33.0);

        checkTemperature(sensorReadings, isOverheating, threshold);

        System.out.println("\n--- Combined Alert (Too Hot OR Too Cold) ---");
        double minTemp = 10.0;
        double maxTemp = 38.0;
        Predicate<Double> tooCold = temp -> temp < minTemp;
        Predicate<Double> tooHot = temp -> temp > maxTemp;
        Predicate<Double> extremeCondition = tooCold.or(tooHot);

        List<Double> extremeReadings = Arrays.asList(8.0, 25.0, 39.0, 5.5, 37.5);
        for (Double temp : extremeReadings) {
            System.out.print("Reading: " + temp + "°C -> ");
            System.out.println(extremeCondition.test(temp) ? "EXTREME ALERT!" : "Normal.");
        }
    }
}
