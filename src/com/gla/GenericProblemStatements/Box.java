package com.gla.GenericProblemStatements;
public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println("Integer: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println("String: " + strBox.get());

        Box<Double> dblBox = new Box<>();
        dblBox.set(3.14);
        System.out.println("Double: " + dblBox.get());
    }
}
