package com.gla.multithreading;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

class Ticket extends Thread {
    int ticketNumber;
    String ticketType;
    static AtomicLong totalProcessingTime = new AtomicLong(0);

    static final String[] TYPES    = {"Critical Bug", "Feature Request", "General Query", "Feedback"};
    static final int[]    PRIORITIES = {10, 4, 2, 1};

    Ticket(int ticketNumber, String ticketType, int priority, String agentName) {
        super(agentName);
        this.ticketNumber = ticketNumber;
        this.ticketType   = ticketType;
        setPriority(priority);
    }

    public void run() {
        Random random = new Random();
        int processingTime = (random.nextInt(5) + 1) * 1000;

        System.out.println("Ticket #" + ticketNumber +
                " | Type: " + ticketType +
                " | Agent: " + getName() +
                " | Priority: " + getPriority() +
                " | Status: Processing Started");

        long startTime = System.currentTimeMillis();

        try {
            Thread.sleep(processingTime);
        } catch (InterruptedException e) {
            System.out.println("Ticket #" + ticketNumber + " interrupted.");
        }

        long elapsed = System.currentTimeMillis() - startTime;
        totalProcessingTime.addAndGet(elapsed);

        System.out.println("Ticket #" + ticketNumber +
                " | Type: " + ticketType +
                " | Agent: " + getName() +
                " | Status: Completed | Time: " + (elapsed / 1000) + "s");
    }
}

public class CustomerSupportSystem {
    public static void main(String[] args) throws InterruptedException {
        String[] types     = Ticket.TYPES;
        int[]    priorities = Ticket.PRIORITIES;

        Ticket[] tickets = new Ticket[10];
        for (int i = 0; i < 10; i++) {
            int typeIndex = i % 4;
            tickets[i] = new Ticket(
                i + 1,
                types[typeIndex],
                priorities[typeIndex],
                "Agent-" + (i + 1)
            );
        }

        System.out.println("===== Customer Support System Started =====");
        System.out.println("Total Tickets: " + tickets.length);
        System.out.println("Ticket queue sorted by priority (highest first):\n");

        for (int i = 0; i < tickets.length - 1; i++) {
            for (int j = 0; j < tickets.length - i - 1; j++) {
                if (tickets[j].getPriority() < tickets[j + 1].getPriority()) {
                    Ticket temp = tickets[j];
                    tickets[j] = tickets[j + 1];
                    tickets[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Queue Position " + (i + 1) +
                    " -> Ticket #" + tickets[i].ticketNumber +
                    " | Type: " + tickets[i].ticketType +
                    " | Priority: " + tickets[i].getPriority());
        }

        System.out.println("\n===== Processing Tickets =====");

        for (Ticket t : tickets) {
            t.start();
        }

        for (Ticket t : tickets) {
            t.join();
        }

        System.out.println("\n===== Statistics =====");
        System.out.println("Total Processing Time: " + (Ticket.totalProcessingTime.get() / 1000) + "s");
        System.out.println("Average Processing Time per Ticket: " +
                (Ticket.totalProcessingTime.get() / 1000 / tickets.length) + "s");
        System.out.println("All tickets have been processed.");
    }
}
