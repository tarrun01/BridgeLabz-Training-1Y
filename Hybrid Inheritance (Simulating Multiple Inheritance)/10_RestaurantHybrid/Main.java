import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Restaurant Management System =========\n");

        Chef chef1 = new Chef("Marco Rossi", 1, "Italian Cuisine", 15);
        Chef chef2 = new Chef("Rajan Nair", 2, "Indian Cuisine", 10);
        Waiter waiter1 = new Waiter("Amit Kumar", 3, 5, "Morning");
        Waiter waiter2 = new Waiter("Sara Ali", 4, 6, "Evening");

        System.out.println("--- Staff Details ---");
        chef1.displayInfo();
        System.out.println();
        chef2.displayInfo();
        System.out.println();
        waiter1.displayInfo();
        System.out.println();
        waiter2.displayInfo();

        System.out.println("\n--- Daily Duties ---");
        List<Worker> workers = new ArrayList<>();
        workers.add(chef1);
        workers.add(chef2);
        workers.add(waiter1);
        workers.add(waiter2);

        for (Worker worker : workers) {
            worker.performDuties();
        }
    }
}
