import java.io.*;

public class Problem1_CheckedException {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            System.out.println("File contents:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
