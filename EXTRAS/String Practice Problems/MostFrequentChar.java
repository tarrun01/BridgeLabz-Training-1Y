import java.util.Scanner;

public class MostFrequentChar {

    static char findMostFrequent(String str) {
        str = str.toLowerCase();
        char mostFrequent = ' ';
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') continue;
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = c;
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = findMostFrequent(input);
        System.out.println("Most Frequent Character: '" + result + "'");

        scanner.close();
    }
}
