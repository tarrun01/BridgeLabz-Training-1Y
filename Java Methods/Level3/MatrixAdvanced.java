public class MatrixAdvanced {
    static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 1 + (int) (Math.random() * 9);
            }
        }
        return matrix;
    }

    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        double[][] result = new double[2][2];
        result[0][0] = (double) m[1][1] / det;
        result[0][1] = (double) -m[0][1] / det;
        result[1][0] = (double) -m[1][0] / det;
        result[1][1] = (double) m[0][0] / det;
        return result;
    }

    static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        double[][] cofactors = new double[3][3];
        cofactors[0][0] = (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
        cofactors[0][1] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        cofactors[0][2] = (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
        cofactors[1][0] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]);
        cofactors[1][1] = (m[0][0] * m[2][2] - m[0][2] * m[2][0]);
        cofactors[1][2] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]);
        cofactors[2][0] = (m[0][1] * m[1][2] - m[0][2] * m[1][1]);
        cofactors[2][1] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]);
        cofactors[2][2] = (m[0][0] * m[1][1] - m[0][1] * m[1][0]);
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = cofactors[j][i] / det;
            }
        }
        return inverse;
    }

    static void displayInt(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void displayDouble(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(Math.round(matrix[i][j] * 100.0) / 100.0 + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] m2 = createRandomMatrix(2, 2);
        int[][] m3 = createRandomMatrix(3, 3);
        System.out.println("2x2 Matrix:");
        displayInt(m2);
        System.out.println("Transpose:");
        displayInt(transpose(m2));
        System.out.println("Determinant 2x2 = " + determinant2x2(m2));
        System.out.println("Inverse 2x2:");
        displayDouble(inverse2x2(m2));
        System.out.println("3x3 Matrix:");
        displayInt(m3);
        System.out.println("Determinant 3x3 = " + determinant3x3(m3));
        System.out.println("Inverse 3x3:");
        displayDouble(inverse3x3(m3));
    }
}
