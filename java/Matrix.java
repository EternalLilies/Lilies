public class Matrix {
    // 打印整数矩阵
    public static void print(int[][] m) {
        if (m == null || m.length == 0 || m[0].length == 0) {
            System.out.println("Matrix is empty or null.");
            return;
        }
        for (int[] row : m) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    // 打印浮点数矩阵
    public static void print(double[][] m) {
        if (m == null || m.length == 0 || m[0].length == 0) {
            System.out.println("Matrix is empty or null.");
            return;
        }
        for (double[] row : m) {
            for (double value : row) {
                System.out.printf("%.2f\t", value); // 格式化输出，保留两位小数
            }
            System.out.println();
        }
    }

    // 检查两个整数矩阵是否具有相同的维度
    public static boolean haveSameDimension(int[][] m1, int[][] m2) {
        if (m1 == null || m2 == null) return false;
        return m1.length == m2.length && m1[0].length == m2[0].length;
    }

    // 检查两个浮点数矩阵是否具有相同的维度
    public static boolean haveSameDimension(double[][] m1, double[][] m2) {
        if (m1 == null || m2 == null) return false;
        return m1.length == m2.length && m1[0].length == m2[0].length;
    }

    // 整数矩阵相加
    public static int[][] add(int[][] m1, int[][] m2) {
        if (!haveSameDimension(m1, m2)) {
            throw new IllegalArgumentException("Matrices do not have the same dimensions.");
        }
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    // 浮点数矩阵相加
    public static double[][] add(double[][] m1, double[][] m2) {
        if (!haveSameDimension(m1, m2)) {
            throw new IllegalArgumentException("Matrices do not have the same dimensions.");
        }
        int rows = m1.length;
        int cols = m1[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    // 整数矩阵相减
    public static int[][] subtract(int[][] m1, int[][] m2) {
        if (!haveSameDimension(m1, m2)) {
            throw new IllegalArgumentException("Matrices do not have the same dimensions.");
        }
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return result;
    }

    // 浮点数矩阵相减
    public static double[][] subtract(double[][] m1, double[][] m2) {
        if (!haveSameDimension(m1, m2)) {
            throw new IllegalArgumentException("Matrices do not have the same dimensions.");
        }
        int rows = m1.length;
        int cols = m1[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return result;
    }

    // 整数矩阵相乘
    public static int[][] multiply(int[][] m1, int[][] m2) {
        if (m1 == null || m2 == null || m1[0].length != m2.length) {
            throw new IllegalArgumentException("Matrices cannot be multiplied.");
        }
        int rows = m1.length;
        int cols = m2[0].length;
        int common = m1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }

    // 浮点数矩阵相乘
    public static double[][] multiply(double[][] m1, double[][] m2) {
        if (m1 == null || m2 == null || m1[0].length != m2.length) {
            throw new IllegalArgumentException("Matrices cannot be multiplied.");
        }
        int rows = m1.length;
        int cols = m2[0].length;
        int common = m1[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }
}
