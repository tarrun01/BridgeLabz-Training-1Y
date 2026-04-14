package com.gla.JavaCollection.QueueInterface;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbers {

    public static void generateBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        System.out.print("Binary numbers up to N=" + n + ": [");
        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            System.out.print(i == n - 1 ? current : current + ", ");
            queue.add(current + "0");
            queue.add(current + "1");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        generateBinary(5);
        generateBinary(8);
    }
}
