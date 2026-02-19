import java.util.ArrayList;
import java.util.List;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String diagnosis;
    private List<String> medicalHistory;

    public OutPatient(int patientId, String name, int age, double consultationFee, String diagnosis) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.diagnosis = diagnosis;
        this.medicalHistory = new ArrayList<>();
    }

    public double getConsultationFee() { return consultationFee; }
    public void setConsultationFee(double consultationFee) { this.consultationFee = consultationFee; }

    private String getDiagnosis() { return diagnosis; }

    @Override
    public double calculateBill() {
        return consultationFee + 150;
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
        System.out.println("--- Out-Patient ---");
        super.getPatientDetails();
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Diagnosis       : " + diagnosis);
        System.out.println("Medical Records : " + medicalHistory);
        System.out.println();
    }
}
