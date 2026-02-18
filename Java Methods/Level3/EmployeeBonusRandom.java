public class EmployeeBonusRandom {
    static double[][] generateSalaryAndService() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + (int) (Math.random() * 90000);
            data[i][1] = (int) (Math.random() * 11);
        }
        return data;
    }

    static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] result = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus;
            if (years > 5) {
                bonus = salary * 5 / 100;
            } else {
                bonus = salary * 2 / 100;
            }
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    static void displaySummary(double[][] original, double[][] updated) {
        double totalOld = 0;
        double totalNew = 0;
        double totalBonus = 0;
        System.out.println("Emp | Old Salary | Years | Bonus   | New Salary");
        for (int i = 0; i < 10; i++) {
            totalOld = totalOld + original[i][0];
            totalNew = totalNew + updated[i][0];
            totalBonus = totalBonus + updated[i][1];
            System.out.println((i + 1) + "   | " + original[i][0] + "     | " + original[i][1] + "     | " + updated[i][1] + " | " + updated[i][0]);
        }
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);
        System.out.println("Total Bonus = " + totalBonus);
    }

    public static void main(String[] args) {
        double[][] salaryData = generateSalaryAndService();
        double[][] updatedData = calculateNewSalaryAndBonus(salaryData);
        displaySummary(salaryData, updatedData);
    }
}
