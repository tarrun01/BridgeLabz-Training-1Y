package com.gla.WrapperLvl2;
import java.util.ArrayList;

public class StudentMarksReport {
    public static void main(String[] args) {
        String[] inputs = {"85", "95", "88", "null", "abc", "72"};

        ArrayList<Integer> marks = new ArrayList<>();

        for (String input : inputs) {
            if (input == null || input.equals("null")) continue;
            try {
                marks.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                System.out.println("Skipping invalid entry: " + input);
            }
        }

        marks.add(Integer.valueOf(88));

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        double average = (double) sum / marks.size();
        System.out.println("Valid Marks: " + marks);
        System.out.println("Average Marks: " + average);
    }
}
