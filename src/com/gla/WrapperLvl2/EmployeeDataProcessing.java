package com.gla.WrapperLvl2;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {34, 22, 45, 28, 55, 19, 41};

        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(age);
        }

        System.out.println("Employee Ages: " + ageList);
        System.out.println("Youngest: " + Collections.min(ageList));
        System.out.println("Oldest: " + Collections.max(ageList));
    }
}
