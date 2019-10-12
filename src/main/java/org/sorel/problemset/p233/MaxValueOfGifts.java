package org.sorel.problemset.p233;

public class MaxValueOfGifts {
    public int getMaxVaule(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;

        int m = matrix.length, n = matrix[0].length;
        int[][] maxValue = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxValue[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int left = j > 0 ? maxValue[i][j - 1] : 0;
                int up = i > 0 ? maxValue[i - 1][j] : 0;
                maxValue[i][j] += Math.max(left, up);
            }
        }
        return maxValue[m - 1][n - 1];
    }
}
