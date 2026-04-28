package com.logisticsroutetracker;

public class RouteLinkedList<T extends Checkpoint> {

    private class Node {
        T data;
        Node next;
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public RouteLinkedList() {
        head = null;
        size = 0;
    }

    public void addCheckpoint(T checkpoint) {
        Node newNode = new Node(checkpoint);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public boolean removeCheckpoint(String checkpointId) {
        if (head == null) return false;

        if (head.data.getCheckpointId().equals(checkpointId)) {
            head = head.next;
            size--;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.getCheckpointId().equals(checkpointId)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public T findCheckpoint(String checkpointId) {
        Node current = head;
        while (current != null) {
            if (current.data.getCheckpointId().equals(checkpointId)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0.0;
        Node current = head;
        while (current != null) {
            total += current.data.getDistanceFromLast();
            current = current.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0.0;
        Node current = head;
        while (current != null) {
            total += current.data.calculatePenalty();
            current = current.next;
        }
        return total;
    }

    public boolean consistencyCheck() {
        boolean hasDelivery = false;
        boolean hasFuel = false;
        Node current = head;
        while (current != null) {
            if (current.data instanceof DeliveryCheckpoint) hasDelivery = true;
            if (current.data instanceof FuelCheckpoint)    hasFuel    = true;
            current = current.next;
        }
        return hasDelivery && hasFuel;
    }

    public void printRoute() {
        Node current = head;
        int index = 1;
        while (current != null) {
            T cp = current.data;
            String status = cp.isDelayed() ? "Delayed" : "On Time";
            System.out.printf("%d. %s – %s – %s – Penalty: %.1f%n",
                    index, cp.getType(), cp.getLocationName(), status, cp.calculatePenalty());
            index++;
            current = current.next;
        }
    }

    public int getSize() { return size; }
}
