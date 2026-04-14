package com.gla.JavaCollection.ListInterface;
import java.util.LinkedList;

public class NthFromEnd {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        java.util.Iterator<T> slow = list.iterator();
        java.util.Iterator<T> fast = list.iterator();

        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                throw new IllegalArgumentException("N is larger than list size");
            }
            fast.next();
        }

        T result = null;
        while (fast.hasNext()) {
            fast.next();
            result = slow.next();
        }

        return result != null ? result : slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A"); list.add("B"); list.add("C"); list.add("D"); list.add("E");

        System.out.println("List: " + list);
        System.out.println("2nd element from end: " + findNthFromEnd(list, 2));
        System.out.println("1st element from end: " + findNthFromEnd(list, 1));
        System.out.println("5th element from end: " + findNthFromEnd(list, 5));
    }
}
