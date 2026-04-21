package com.gla.StreamAPI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Doctor {
    private String name;
    private String specialty;
    private boolean availableOnWeekends;
    private int experienceYears;

    public Doctor(String name, String specialty, boolean availableOnWeekends, int experienceYears) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekends = availableOnWeekends;
        this.experienceYears = experienceYears;
    }

    public String getName()               { return name; }
    public String getSpecialty()          { return specialty; }
    public boolean isAvailableOnWeekends(){ return availableOnWeekends; }
    public int getExperienceYears()       { return experienceYears; }

    public String toString() {
        return String.format("%-20s Specialty: %-15s Experience: %d yrs  Weekend: %s",
                name, specialty, experienceYears, availableOnWeekends ? "Yes" : "No");
    }
}

public class DoctorAvailability {

    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Mehta",   "Cardiology",    true,  15),
            new Doctor("Dr. Sharma",  "Neurology",     false, 10),
            new Doctor("Dr. Patel",   "Cardiology",    true,  8),
            new Doctor("Dr. Rao",     "Orthopedics",   true,  20),
            new Doctor("Dr. Singh",   "Neurology",     true,  12),
            new Doctor("Dr. Gupta",   "Dermatology",   false, 6),
            new Doctor("Dr. Verma",   "Orthopedics",   false, 18),
            new Doctor("Dr. Khan",    "Dermatology",   true,  9),
            new Doctor("Dr. Joshi",   "Cardiology",    false, 14),
            new Doctor("Dr. Nair",    "Pediatrics",    true,  7)
        );

        System.out.println("=== Doctors Available on Weekends (Sorted by Specialty) ===");
        doctors.stream()
                .filter(Doctor::isAvailableOnWeekends)
                .sorted(Comparator.comparing(Doctor::getSpecialty)
                        .thenComparingInt(Doctor::getExperienceYears).reversed())
                .forEach(System.out::println);

        System.out.println("\n=== Weekend Cardiologists ===");
        doctors.stream()
                .filter(Doctor::isAvailableOnWeekends)
                .filter(d -> d.getSpecialty().equals("Cardiology"))
                .sorted(Comparator.comparingInt(Doctor::getExperienceYears).reversed())
                .forEach(System.out::println);

        System.out.println("\n=== Total Weekend-Available Doctors per Specialty ===");
        doctors.stream()
                .filter(Doctor::isAvailableOnWeekends)
                .collect(java.util.stream.Collectors.groupingBy(Doctor::getSpecialty,
                        java.util.stream.Collectors.counting()))
                .entrySet().stream()
                .sorted(java.util.Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
