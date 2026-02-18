package com.gla.stringapi.Level3;

import java.util.Scanner;

public class BMICalculatorTeam {


    static String[][] calcBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5)       status = "Underweight";
            else if (bmi < 25)    status = "Normal";
            else if (bmi < 30)    status = "Overweight";
            else                  status = "Obese";
            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Method to display result in tabular format
    static void display(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------");
        for (String[] row : result)
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) and height (cm) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble(); 
            data[i][1] = sc.nextDouble(); 
        }
        display(calcBMI(data));
        sc.close();
    }
}
