import java.util.Scanner;

public class RemoveCharacter {

    static String removeChar(String str, char target) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != target) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string          : ");
        String input = scanner.nextLine();

        System.out.print("Enter character to remove: ");
        char target = scanner.nextLine().charAt(0);

        System.out.println("Original String  : " + input);
        System.out.println("Modified String  : " + removeChar(input, target));

        scanner.close();
    }
}
