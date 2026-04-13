package com.gla.GenericProblemStatements;
import java.util.Arrays;
import java.util.List;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

public class AnimalHierarchy {

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println("Animal: " + a.getName());
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog("Rex"), new Dog("Bruno"));
        List<Cat> cats = Arrays.asList(new Cat("Whiskers"), new Cat("Luna"));

        System.out.println("Dogs:");
        printAnimals(dogs);

        System.out.println("Cats:");
        printAnimals(cats);
    }
}
