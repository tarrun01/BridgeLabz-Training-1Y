package com.gla.JavaCollection.QueueInterface;
import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public int compareTo(Patient other) {
        return other.severity - this.severity;
    }

    public String toString() {
        return name + " (severity=" + severity + ")";
    }
}

public class HospitalTriage {

    public static void main(String[] args) {
        PriorityQueue<Patient> triage = new PriorityQueue<>();
        triage.add(new Patient("John", 3));
        triage.add(new Patient("Alice", 5));
        triage.add(new Patient("Bob", 2));

        System.out.println("Treatment order:");
        while (!triage.isEmpty()) {
            System.out.println("Treating: " + triage.poll());
        }
    }
}
