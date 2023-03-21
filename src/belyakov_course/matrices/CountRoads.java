package belyakov_course.matrices;

/**
 * В первой строке подаётся целое число N (0 ≤ N ≤ 100);
 * в следующих N строках записано по N чисел, каждое из которых является единичкой или ноликом.
 * Причем, если в позиции (i, j) квадратной матрицы стоит единичка, то i-ый и j-ый точки охоты соединены тропами,
 * а если нолик, то не соединены.
 * На экран необходимо вывести число, определяющее количество троп.
 */

import java.util.Scanner;

class CountRoads {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n= scanner.nextInt();
        int[][] pointRelations = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pointRelations[i][j] = scanner.nextInt();
            }
        }
        System.out.println(countRoads(n, pointRelations));

    }

    private static int countRoads(int size, int[][] pointRelations) {
        if (size == 0) return 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (pointRelations[i][j] == 1) {
                    count++;
                    pointRelations[j][i] = 0;
                }
            }
        }
        return count;
    }
}
