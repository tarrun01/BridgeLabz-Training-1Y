import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;
    private String diagnosis;
    private List<String> medicalHistory;

    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyCharge, String diagnosis) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
        this.diagnosis = diagnosis;
        this.medicalHistory = new ArrayList<>();
    }

    public int getDaysAdmitted() { return daysAdmitted; }
    public void setDaysAdmitted(int daysAdmitted) { this.daysAdmitted = daysAdmitted; }

    public double getDailyCharge() { return dailyCharge; }
    public void setDailyCharge(double dailyCharge) { this.dailyCharge = dailyCharge; }

    private String getDiagnosis() { return diagnosis; }
    private void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge + 500;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return medicalHistory;
    }

    @Override
    public void getPatientDetails() {
        System.out.println("--- In-Patient ---");
        super.getPatientDetails();
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Diagnosis    : " + diagnosis);
        System.out.println("Medical Records: " + medicalHistory);
        System.out.println();
    }
}
