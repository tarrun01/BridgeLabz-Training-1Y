package com.gla.JavaCollection.Others;
import java.util.*;

class Booking implements Comparable<Booking> {
    private String bookingId;
    private String userId;
    private boolean isVip;

    public Booking(String bookingId, String userId, boolean isVip) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.isVip = isVip;
    }

    public boolean isVip() { return isVip; }
    public int compareTo(Booking other) { return Boolean.compare(other.isVip, this.isVip); }
    public String toString() { return "Booking[" + bookingId + ", " + userId + ", VIP=" + isVip + "]"; }
}

public class EventTicketSystem {

    public static void main(String[] args) {
        List<Booking> confirmedBookings = new ArrayList<>();
        Set<String> registeredUsers = new HashSet<>();
        Queue<Booking> bookingQueue = new LinkedList<>();
        PriorityQueue<Booking> vipQueue = new PriorityQueue<>();

        String[] userIds = {"U001", "U002", "U001", "U003", "U004"};
        boolean[] vipFlags = {false, true, false, false, true};

        System.out.println("Registering Users and Booking:");
        int bookingCount = 1;
        for (int i = 0; i < userIds.length; i++) {
            if (registeredUsers.add(userIds[i])) {
                Booking b = new Booking("B00" + bookingCount++, userIds[i], vipFlags[i]);
                bookingQueue.add(b);
                vipQueue.add(b);
                System.out.println("Booking accepted: " + b);
            } else {
                System.out.println("Duplicate user rejected: " + userIds[i]);
            }
        }

        System.out.println("\nProcessing VIP Bookings First:");
        while (!vipQueue.isEmpty()) {
            Booking b = vipQueue.poll();
            confirmedBookings.add(b);
            System.out.println("Confirmed: " + b);
        }

        System.out.println("\nAll Confirmed Bookings: " + confirmedBookings);
    }
}
