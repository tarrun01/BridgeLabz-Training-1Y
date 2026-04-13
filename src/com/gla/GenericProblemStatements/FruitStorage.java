package com.gla.GenericProblemStatements;
import java.util.ArrayList;
import java.util.List;

class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Apple extends Fruit {
    public Apple() {
        super("Apple");
    }
}

class Mango extends Fruit {
    public Mango() {
        super("Mango");
    }
}

class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void display() {
        for (T fruit : fruits) {
            System.out.println("Fruit: " + fruit.getName());
        }
    }
}

public class FruitStorage {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.display();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango());
        mangoBox.display();
    }
}
