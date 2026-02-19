import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Animal Hierarchy =========\n");

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Bruno", 3, "Labrador"));
        animals.add(new Cat("Whiskers", 5, true));
        animals.add(new Bird("Tweety", 2, 25.5));

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            System.out.println();
        }
    }
}
