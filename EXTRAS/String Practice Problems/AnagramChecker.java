import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase().replaceAll("\\s+", "");
        s2 = s2.toLowerCase().replaceAll("\\s+", "");

        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter String 2: ");
        String s2 = scanner.nextLine();

        if (isAnagram(s1, s2)) {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" ARE anagrams of each other.");
        } else {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are NOT anagrams of each other.");
        }

        scanner.close();
    }
}
