import java.util.Scanner;

public class RemoveDuplicates {

    static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Original : " + input);
        System.out.println("Modified : " + removeDuplicates(input));

        scanner.close();
    }
}
