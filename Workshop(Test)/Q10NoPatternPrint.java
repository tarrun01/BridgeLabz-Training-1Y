import java.util.*;

public class Q10NoPatternPrint {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            list.add(i);
        }

        boolean left = true;

        while (list.size() > 1) {
            int mid = list.size() / 2;

            if (left) {
                list.remove(mid - 1);
            } else {
                list.remove(mid);
            }

            left = !left;
            for (int num : list) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}