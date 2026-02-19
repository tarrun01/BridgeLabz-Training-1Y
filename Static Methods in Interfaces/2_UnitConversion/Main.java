public class Main {
    public static void main(String[] args) {
        System.out.println("========= Unit Conversion Tool =========\n");

        System.out.println("--- Distance Conversions ---");
        double km = 100.0;
        System.out.printf("%.2f km = %.4f miles%n", km, UnitConverter.kmToMiles(km));
        double miles = 62.0;
        System.out.printf("%.2f miles = %.4f km%n", miles, UnitConverter.milesToKm(miles));

        System.out.println("\n--- Weight Conversions ---");
        double kg = 75.0;
        System.out.printf("%.2f kg = %.4f lbs%n", kg, UnitConverter.kgToLbs(kg));
        double lbs = 165.0;
        System.out.printf("%.2f lbs = %.4f kg%n", lbs, UnitConverter.lbsToKg(lbs));

        System.out.println("\n--- Temperature Conversions ---");
        double celsius = 37.0;
        System.out.printf("%.2f°C = %.2f°F%n", celsius, UnitConverter.celsiusToFahrenheit(celsius));

        System.out.println("\n--- Volume Conversion ---");
        double liters = 50.0;
        System.out.printf("%.2f liters = %.4f cubic feet%n", liters, UnitConverter.litersToCubicFeet(liters));
    }
}
