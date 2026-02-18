import java.util.Scanner;

public class BMITeamMethod {
    static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double heightM = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (heightM * heightM);
        }
    }

    static String[] getBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25.0) {
                status[i] = "Normal weight";
            } else if (bmi < 30.0) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + " (cm): ");
            personData[i][1] = scanner.nextDouble();
        }
        calculateBMI(personData);
        String[] status = getBMIStatus(personData);
        System.out.println("Person | Weight | Height | BMI   | Status");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "      | " + personData[i][0] + "  | " + personData[i][1] + "  | " + Math.round(personData[i][2] * 100.0) / 100.0 + " | " + status[i]);
        }
        scanner.close();
    }
}
