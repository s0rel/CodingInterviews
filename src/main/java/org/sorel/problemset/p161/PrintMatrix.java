package org.sorel.problemset.p161;

public class PrintMatrix {
    public void printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int start = 0, row = matrix.length, col = matrix[0].length;
        while (start * 2 < row && start * 2 < col) {
            printMatrixInCircle(matrix, start);
            start++;
        }
        System.out.println();
    }

    private void printMatrixInCircle(int[][] matrix, int start) {
        int row = matrix.length, col = matrix[0].length;
        int endX = col - 1 - start, endY = row - 1 - start;

        for (int i = start; i <= endX; i++) {
            System.out.print(matrix[start][i] + " ");
        }
        if (start < endY) {
            for (int i = start + 1; i <= endY; i++) {
                System.out.print(matrix[i][endX] + " ");
            }
        }
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; i--) {
                System.out.print(matrix[endY][i] + " ");
            }
        }
        if (start < endX && start < endY - 1) {
            for (int i = endY - 1; i >= start + 1; i--) {
                System.out.print(matrix[i][start] + " ");
            }
        }
    }
}
