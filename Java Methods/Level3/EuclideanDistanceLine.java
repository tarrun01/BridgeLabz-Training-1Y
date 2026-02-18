import java.util.Scanner;

public class EuclideanDistanceLine {
    static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.println("Euclidean Distance = " + findDistance(x1, y1, x2, y2));
        double[] line = findLineEquation(x1, y1, x2, y2);
        System.out.println("Slope (m) = " + line[0]);
        System.out.println("Y-intercept (b) = " + line[1]);
        System.out.println("Equation: y = " + line[0] + "x + " + line[1]);
        scanner.close();
    }
}
