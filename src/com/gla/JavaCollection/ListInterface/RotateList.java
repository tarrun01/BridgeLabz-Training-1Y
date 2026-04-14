package com.gla.JavaCollection.ListInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateList {

    public static <T> void rotate(List<T> list, int positions) {
        int n = list.size();
        positions = positions % n;
        reverse(list, 0, positions - 1);
        reverse(list, positions, n - 1);
        reverse(list, 0, n - 1);
    }

    private static <T> void reverse(List<T> list, int left, int right) {
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Before rotation: " + list);
        rotate(list, 2);
        System.out.println("After rotating by 2: " + list);
    }
}
