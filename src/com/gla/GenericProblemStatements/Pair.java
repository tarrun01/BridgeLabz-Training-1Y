package com.gla.GenericProblemStatements;
public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Amol", 20);
        System.out.println("Name: " + student.getFirst());
        System.out.println("Age: " + student.getSecond());

        Pair<String, Double> product = new Pair<>("Laptop", 999.99);
        System.out.println("Product: " + product.getFirst());
        System.out.println("Price: " + product.getSecond());
    }
}
