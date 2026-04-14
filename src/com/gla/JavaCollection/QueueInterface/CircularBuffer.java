package com.gla.JavaCollection.QueueInterface;
public class CircularBuffer {

    private int[] buffer;
    private int size;
    private int head;
    private int count;

    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.head = 0;
        this.count = 0;
    }

    public void insert(int value) {
        if (count < size) {
            buffer[(head + count) % size] = value;
            count++;
        } else {
            buffer[head] = value;
            head = (head + 1) % size;
        }
    }

    public void display() {
        System.out.print("Buffer: [");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(head + i) % size]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();

        cb.insert(4);
        cb.display();

        cb.insert(5);
        cb.display();
    }
}
