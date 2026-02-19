import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient inPatient = new InPatient(1, "Rahul Sharma", 45, 5, 2000, "Typhoid");
        inPatient.addRecord("Blood test done on Day 1");
        inPatient.addRecord("Prescribed antibiotics on Day 2");

        OutPatient outPatient = new OutPatient(2, "Priya Singh", 30, 500, "Migraine");
        outPatient.addRecord("X-Ray done");
        outPatient.addRecord("Prescribed pain relief medication");

        patients.add(inPatient);
        patients.add(outPatient);

        System.out.println("========= Hospital Patient Management System =========\n");
        for (Patient patient : patients) {
            patient.getPatientDetails();
        }
    }
}
