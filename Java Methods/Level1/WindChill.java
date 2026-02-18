import java.util.Scanner;

public class WindChill {
    static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature (F): ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter wind speed (mph): ");
        double windSpeed = scanner.nextDouble();
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill Temperature = " + windChill + " F");
        scanner.close();
    }
}
