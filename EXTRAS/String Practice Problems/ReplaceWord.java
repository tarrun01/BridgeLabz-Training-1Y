import java.util.Scanner;

public class ReplaceWord {

    static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result += newWord;
            } else {
                result += words[i];
            }
            if (i < words.length - 1) {
                result += " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sentence  : ");
        String sentence = scanner.nextLine();

        System.out.print("Word to replace     : ");
        String oldWord = scanner.nextLine();

        System.out.print("Replace with        : ");
        String newWord = scanner.nextLine();

        String result = replaceWord(sentence, oldWord, newWord);

        System.out.println("Original  : " + sentence);
        System.out.println("Modified  : " + result);

        scanner.close();
    }
}
