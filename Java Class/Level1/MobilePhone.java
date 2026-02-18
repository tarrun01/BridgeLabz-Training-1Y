import java.util.Scanner;

public class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MobilePhone phone = new MobilePhone();
        System.out.print("Enter brand: ");
        phone.brand = scanner.nextLine();
        System.out.print("Enter model: ");
        phone.model = scanner.nextLine();
        System.out.print("Enter price: ");
        phone.price = scanner.nextDouble();
        phone.displayDetails();
        scanner.close();
    }
}
