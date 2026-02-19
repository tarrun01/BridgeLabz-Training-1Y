import java.util.Scanner;

public class SubstringOccurrences {

    static int countOccurrences(String text, String substring) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string   : ");
        String text = scanner.nextLine();

        System.out.print("Enter the substring     : ");
        String substring = scanner.nextLine();

        int count = countOccurrences(text, substring);
        System.out.println("\"" + substring + "\" occurs " + count + " time(s) in the given string.");

        scanner.close();
    }
}
