import java.util.Scanner;

public class UniqueCharacterFinder {

    // Custom length without using length()
    static int getLength(String s) {
        int count = 0;
        for (char c : s.toCharArray()) count++;
        return count;
    }

    // Find unique characters using charAt()
    static char[] uniqueChars(String s) {
        int len = getLength(s);
        char[] temp = new char[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) { isUnique = false; break; }
            }
            if (isUnique) temp[count++] = s.charAt(i);
        }
        // Copy to exact-size array
        char[] result = new char[count];
        for (int i = 0; i < count; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Unique characters: ");
        for (char c : uniqueChars(s)) System.out.print(c + " ");
        System.out.println();
    }
}
