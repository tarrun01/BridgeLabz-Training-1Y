package com.gla.MethodReferences;
import java.util.Arrays;
import java.util.List;

class Patient {
    private String patientId;
    private String name;

    public Patient(String patientId, String name) {
        this.patientId = patientId;
        this.name = name;
    }

    public String getPatientId() { return patientId; }

    public void printId() {
        System.out.println("Patient ID: " + patientId + " | Name: " + name);
    }
}

public class HospitalPatientPrinting {

    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
            new Patient("P001", "Alice"),
            new Patient("P002", "Bob"),
            new Patient("P003", "Charlie"),
            new Patient("P004", "Diana"),
            new Patient("P005", "Eve")
        );

        System.out.println("=== Patient ID Verification (Instance Method Reference) ===");
        patients.forEach(Patient::printId);

        System.out.println("\n=== Patient IDs Only (Static-style via println) ===");
        patients.stream()
                .map(Patient::getPatientId)
                .forEach(System.out::println);
    }
}
