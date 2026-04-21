package com.gla.LambdaExpressions;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    private String patientName;
    private String type;
    private int severity;
    private String ward;

    public Alert(String patientName, String type, int severity, String ward) {
        this.patientName = patientName;
        this.type = type;
        this.severity = severity;
        this.ward = ward;
    }

    public String getPatientName() { return patientName; }
    public String getType()        { return type; }
    public int getSeverity()       { return severity; }
    public String getWard()        { return ward; }

    public String toString() {
        return String.format("[%s] Patient: %-12s Severity: %d  Ward: %s",
                type, patientName, severity, ward);
    }
}

public class NotificationFiltering {

    static void showFiltered(List<Alert> alerts, Predicate<Alert> filter, String label) {
        System.out.println("\n=== " + label + " ===");
        List<Alert> filtered = alerts.stream().filter(filter).collect(Collectors.toList());
        if (filtered.isEmpty()) System.out.println("  No alerts match this filter.");
        else filtered.forEach(a -> System.out.println("  " + a));
    }

    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Alice",   "CRITICAL",  9, "ICU"),
            new Alert("Bob",     "MEDICATION",3, "General"),
            new Alert("Charlie", "CRITICAL",  8, "ICU"),
            new Alert("Diana",   "VITALS",    5, "Cardiology"),
            new Alert("Eve",     "MEDICATION",2, "General"),
            new Alert("Frank",   "CRITICAL",  10,"ICU"),
            new Alert("Grace",   "VITALS",    6, "Neurology"),
            new Alert("Henry",   "LAB",       4, "General")
        );

        Predicate<Alert> isCritical          = alert -> alert.getType().equals("CRITICAL");
        Predicate<Alert> isHighSeverity      = alert -> alert.getSeverity() >= 7;
        Predicate<Alert> isICU               = alert -> alert.getWard().equals("ICU");
        Predicate<Alert> isMedication        = alert -> alert.getType().equals("MEDICATION");
        Predicate<Alert> isLowSeverity       = alert -> alert.getSeverity() < 4;
        Predicate<Alert> criticalAndHighSev  = isCritical.and(isHighSeverity);
        Predicate<Alert> criticalOrMedication = isCritical.or(isMedication);
        Predicate<Alert> notICU              = isICU.negate();

        showFiltered(alerts, isCritical,           "Critical Alerts Only");
        showFiltered(alerts, isHighSeverity,        "High Severity (>= 7)");
        showFiltered(alerts, isICU,                 "ICU Ward Alerts");
        showFiltered(alerts, isMedication,          "Medication Reminders");
        showFiltered(alerts, isLowSeverity,         "Low Severity (< 4)");
        showFiltered(alerts, criticalAndHighSev,    "Critical AND High Severity");
        showFiltered(alerts, criticalOrMedication,  "Critical OR Medication");
        showFiltered(alerts, notICU,                "Non-ICU Alerts");
    }
}
