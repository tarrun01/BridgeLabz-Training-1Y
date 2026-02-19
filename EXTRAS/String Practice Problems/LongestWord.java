import java.util.Scanner;

public class LongestWord {

    static String findLongestWord(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        System.out.println("Longest Word: " + findLongestWord(input));

        scanner.close();
    }
}
