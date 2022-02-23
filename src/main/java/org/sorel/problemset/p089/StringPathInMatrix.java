package org.sorel.problemset.p089;

public class StringPathInMatrix {
    public boolean hasPath(char[][] matrix, String str) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0 ||
                str == null || str.length() == 0) {
            return false;
        }

        int row = matrix.length, col = matrix[0].length;
        boolean[][] flag = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                flag[i][j] = false;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (hasPath(matrix, i, j, flag, str, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasPath(char[][] matrix, int x, int y, boolean[][] flag, String str, int idx) {
        if (idx >= str.length()) {
            return true;
        }

        int row = matrix.length, col = matrix[0].length;
        if (x < 0 || x >= row || y < 0 || y >= col) {
            return false;
        }

        boolean res = false;
        if (!flag[x][y] && matrix[x][y] == str.charAt(idx)) {
            flag[x][y] = true;
            res = hasPath(matrix, x - 1, y, flag, str, idx + 1) ||
                    hasPath(matrix, x + 1, y, flag, str, idx + 1) ||
                    hasPath(matrix, x, y - 1, flag, str, idx + 1) ||
                    hasPath(matrix, x, y + 1, flag, str, idx + 1);
            if (!res) {
                flag[x][y] = false;
            }
        }
        return res;
    }
}
