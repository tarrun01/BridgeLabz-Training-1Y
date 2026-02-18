import java.util.Scanner;

public class Circle {
    double radius;

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + calculateArea());
        System.out.println("Circumference = " + calculateCircumference());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("Enter radius: ");
        c.radius = scanner.nextDouble();
        c.display();
        scanner.close();
    }
}
