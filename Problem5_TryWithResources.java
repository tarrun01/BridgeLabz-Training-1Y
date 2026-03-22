import java.io.*;

public class Problem5_TryWithResources {
    public static void main(String[] args) {
        // Using try-with-resources to automatically close BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {
            String firstLine = reader.readLine();
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
