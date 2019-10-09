package org.sorel.problemset.p044;

public class FindInPartiallySortedMatrix {
    public boolean searchIn2DArray(int[][] matrix, int num) {
        if (matrix == null || matrix[0] == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = matrix.length, col = matrix[0].length;
        int x = 0, y = col - 1;
        while (x < row && y >= 0) {
            if (matrix[x][y] > num) {
                y--;
            } else if (matrix[x][y] < num) {
                x++;
            } else {
                return true;
            }
        }
        return false;
    }
}
