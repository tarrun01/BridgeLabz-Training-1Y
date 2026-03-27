package com.gla.multithreading;

class Order implements Runnable {
    int orderId;
    String restaurantName;
    int deliveryTimeSeconds;
    String deliveryType;

    Order(int orderId, String restaurantName, int deliveryTimeSeconds, String deliveryType) {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.deliveryTimeSeconds = deliveryTimeSeconds;
        this.deliveryType = deliveryType;
    }

    public void run() {
        String agent = Thread.currentThread().getName();
        long startTime = System.currentTimeMillis();

        System.out.println("Order #" + orderId + " | Type: " + deliveryType +
                " | Agent: " + agent + " | Restaurant: " + restaurantName +
                " | Priority: " + Thread.currentThread().getPriority() +
                " | Status: Picked Up");

        try {
            Thread.sleep(deliveryTimeSeconds * 1000 / 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Order #" + orderId + " | Agent: " + agent + " | Status: In Transit");

        try {
            Thread.sleep((deliveryTimeSeconds * 1000 * 2) / 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long totalTime = (System.currentTimeMillis() - startTime) / 1000;
        System.out.println("Order #" + orderId + " | Agent: " + agent +
                " | Status: Delivered | Total Time: " + totalTime + " seconds");
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Pizza Palace",  2, "Express"),
            new Order(102, "Burger Barn",   4, "Standard"),
            new Order(103, "Sushi Stop",    3, "Express"),
            new Order(104, "Taco Town",     5, "Economy"),
            new Order(105, "Noodle Nest",   6, "Economy")
        };

        int[] priorities = {10, 5, 10, 3, 3};

        Thread[] threads = new Thread[orders.length];
        for (int i = 0; i < orders.length; i++) {
            threads[i] = new Thread(orders[i], "Agent-" + (i + 1));
            threads[i].setPriority(priorities[i]);
        }

        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All orders have been delivered.");
    }
}
