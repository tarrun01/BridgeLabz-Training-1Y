import java.util.Scanner;

public class CharFrequencyUniqueChars {

    // Find unique characters using nested loops
    static char[] uniqueChars(String s) {
        char[] temp = new char[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++)
                if (s.charAt(i) == s.charAt(j)) { isUnique = false; break; }
            if (isUnique) temp[count++] = s.charAt(i);
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) result[i] = temp[i];
        return result;
    }

    // Find frequency using unique characters method
    static String[][] charFrequency(String s) {
        // Count frequency using ASCII index
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;

        // Get unique characters
        char[] unique = uniqueChars(s);

        // Store unique chars and their frequencies
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.printf("%-12s %-10s%n", "Character", "Frequency");
        System.out.println("----------------------");
        for (String[] row : charFrequency(s))
            System.out.printf("%-12s %-10s%n", row[0], row[1]);
    }
}
