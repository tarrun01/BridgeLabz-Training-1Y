package com.gla.JavaCollection.ListInterface;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    public static <T> void reverse(List<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); arrayList.add(2); arrayList.add(3); arrayList.add(4); arrayList.add(5);
        System.out.println("ArrayList Before: " + arrayList);
        reverse(arrayList);
        System.out.println("ArrayList After:  " + arrayList);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1); linkedList.add(2); linkedList.add(3); linkedList.add(4); linkedList.add(5);
        System.out.println("LinkedList Before: " + linkedList);
        reverse(linkedList);
        System.out.println("LinkedList After:  " + linkedList);
    }
}
