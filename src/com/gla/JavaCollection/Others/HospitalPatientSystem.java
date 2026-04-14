package com.gla.JavaCollection.Others;
import java.util.*;

class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }

    public boolean equals(Object obj) {
        if (!(obj instanceof Patient)) return false;
        return this.patientId.equals(((Patient) obj).patientId);
    }

    public int hashCode() { return Objects.hash(patientId); }
    public String toString() { return "Patient[" + patientId + ", " + name + ", age=" + age + "]"; }
}

public class HospitalPatientSystem {

    public static void main(String[] args) {
        Set<Patient> admittedPatients = new HashSet<>();
        Queue<Patient> treatmentQueue = new LinkedList<>();
        Stack<Patient> dischargedPatients = new Stack<>();
        List<Patient> patientHistory = new ArrayList<>();

        Patient p1 = new Patient("P001", "Alice", 30);
        Patient p2 = new Patient("P002", "Bob", 45);
        Patient p3 = new Patient("P003", "Charlie", 60);
        Patient duplicate = new Patient("P001", "Alice-Dup", 30);

        System.out.println("Admitting Patients:");
        for (Patient p : new Patient[]{p1, p2, p3, duplicate}) {
            if (admittedPatients.add(p)) {
                treatmentQueue.add(p);
                patientHistory.add(p);
                System.out.println("Admitted: " + p);
            } else {
                System.out.println("Already admitted: " + p);
            }
        }

        System.out.println("\nTreating Patients:");
        while (!treatmentQueue.isEmpty()) {
            Patient p = treatmentQueue.poll();
            System.out.println("Treating: " + p);
            admittedPatients.remove(p);
            dischargedPatients.push(p);
            System.out.println("Discharged: " + p);
        }

        System.out.println("\nRe-admitting Last Discharged Patient:");
        if (!dischargedPatients.isEmpty()) {
            Patient readmit = dischargedPatients.pop();
            admittedPatients.add(readmit);
            treatmentQueue.add(readmit);
            System.out.println("Re-admitted: " + readmit);
        }

        System.out.println("\nTotal Patient History: " + patientHistory);
    }
}
