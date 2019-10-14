package org.sorel.problemset.p161;

import java.util.ArrayList;
import java.util.List;

public class PrintMatrix {
    public List<Integer> printMatrix(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }

        int down = 0;
        int up = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (down <= up && left <= right) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[down][i]);
            }

            for (int i = down + 1; i <= up; i++) {
                res.add(matrix[i][right]);
            }

            //向左 有可能出现特殊的情况只有一列，为了避免重复访问
            if (down < up) {
                for (int i = right - 1; i >= left; i--) {
                    res.add(matrix[up][i]);
                }
            }

            //向上 有可能出现特殊的情况只有一行，为了避免重复访问
            if (left < right) {
                for (int i = up - 1; i >= down + 1; i--) {
                    res.add(matrix[i][left]);
                }
            }

            down++;
            up--;
            left++;
            right--;
        }
        return res;
    }
}
