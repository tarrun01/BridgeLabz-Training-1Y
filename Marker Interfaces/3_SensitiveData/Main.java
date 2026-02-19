import java.util.Arrays;
import java.util.List;

public class Main {

    public static void processData(Object data) {
        if (data instanceof SensitiveData) {
            System.out.println("[ENCRYPTION APPLIED] Securing sensitive data: " + encrypt(data.toString()));
        } else {
            System.out.println("[NO ENCRYPTION] Processing normal data: " + data);
        }
    }

    private static String encrypt(String data) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : data.toCharArray()) {
            encrypted.append((char) (c + 3));
        }
        return "[ENCRYPTED:" + encrypted.toString().substring(0, Math.min(30, encrypted.length())) + "...]";
    }

    public static void main(String[] args) {
        System.out.println("========= Sensitive Data Tagging =========\n");

        List<Object> dataObjects = Arrays.asList(
            new UserProfile("alice99", "alice@email.com", "9876543210", "1234-5678-9012"),
            new ProductInfo("Laptop", 75000),
            new UserProfile("bob_dev", "bob@email.com", "9123456789", "9876-5432-1098")
        );

        for (Object data : dataObjects) {
            processData(data);
        }
    }
}
