import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printFinalPrice(Product product) {
        double price = product.getPrice();
        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            Taxable taxable = (Taxable) product;
            tax = taxable.calculateTax();
            System.out.println(taxable.getTaxDetails());
        }

        double finalPrice = price + tax - discount;

        product.displayProduct();
        System.out.printf("Discount   : %.2f%n", discount);
        System.out.printf("Tax        : %.2f%n", tax);
        System.out.printf("Final Price: %.2f%n%n", finalPrice);
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(1, "Laptop", 80000));
        products.add(new Clothing(2, "Jacket", 3000));
        products.add(new Groceries(3, "Rice Bag", 500));

        System.out.println("========= E-Commerce Platform =========\n");
        for (Product product : products) {
            printFinalPrice(product);
        }
    }
}
