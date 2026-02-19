import java.io.*;

public class Main {

    public static void backup(Object obj, String filename) {
        if (!(obj instanceof Backupable)) {
            System.out.println("Object is not marked as Backupable. Skipping backup.");
            return;
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(obj);
            System.out.println("Backup successful: " + filename);
        } catch (IOException e) {
            System.out.println("Backup failed: " + e.getMessage());
        }
    }

    public static Object restore(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Object obj = ois.readObject();
            System.out.println("Restore successful from: " + filename);
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Restore failed: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("========= Data Serialization for Backup =========\n");

        EmployeeRecord emp = new EmployeeRecord(101, "Alice Johnson", "Engineering");
        System.out.println("Original Object: " + emp);

        backup(emp, "employee_backup.ser");

        EmployeeRecord restored = (EmployeeRecord) restore("employee_backup.ser");
        if (restored != null) {
            System.out.println("Restored Object: " + restored);
        }

        System.out.println("\n--- Attempting backup on non-Backupable object ---");
        backup(new Object(), "invalid.ser");

        new File("employee_backup.ser").delete();
    }
}
