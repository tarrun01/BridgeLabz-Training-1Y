package com.gla.WrapperLvl2;
import java.util.ArrayList;

public class PerformanceBenchmark {
    public static void main(String[] args) {
        int size = 1_000_000;

        ArrayList<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long sum1 = 0;
        for (int val : list) {
            sum1 += val;
        }
        long listTime = System.currentTimeMillis() - start;

        int[] arr = new int[size];
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        long sum2 = 0;
        for (int val : arr) {
            sum2 += val;
        }
        long arrTime = System.currentTimeMillis() - start;

        System.out.println("ArrayList<Integer> sum: " + sum1 + " | Time: " + listTime + " ms");
        System.out.println("int[] sum:              " + sum2 + " | Time: " + arrTime + " ms");
        System.out.println("int[] is faster due to no boxing/unboxing overhead.");
    }
}
