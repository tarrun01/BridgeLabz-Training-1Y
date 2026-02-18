import java.util.Scanner;

public class UnitConvertorDistance {
    static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter km: ");
        double km = scanner.nextDouble();
        System.out.println(km + " km = " + convertKmToMiles(km) + " miles");
        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
        System.out.print("Enter meters: ");
        double meters = scanner.nextDouble();
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
        System.out.print("Enter feet: ");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
        scanner.close();
    }
}
