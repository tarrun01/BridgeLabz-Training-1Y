public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay;

    CarRental() {
        customerName = "Customer";
        carModel = "Standard Car";
        rentalDays = 1;
        ratePerDay = 1000.0;
    }

    CarRental(String customerName, String carModel, int rentalDays, double ratePerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.ratePerDay = ratePerDay;
    }

    double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        r1.display();
        System.out.println();
        CarRental r2 = new CarRental("Alice", "Toyota Camry", 5, 1500.0);
        r2.display();
    }
}
