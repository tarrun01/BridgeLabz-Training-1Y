import java.util.ArrayList;
import java.util.HashSet;

public class removeduplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(10);
        list.add(40);
        System.out.println("Original List: " + list);
        HashSet<Integer> set = new HashSet<>(list);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);
        System.out.println("After Removing Duplicates the string is : " + uniqueList);
    }
}