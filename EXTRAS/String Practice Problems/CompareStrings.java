import java.util.Scanner;

public class CompareStrings {

    static int compareStrings(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter String 2: ");
        String s2 = scanner.nextLine();

        int result = compareStrings(s1, s2);

        if (result < 0) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are equal.");
        }

        scanner.close();
    }
}
