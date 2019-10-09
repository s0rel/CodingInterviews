package org.sorel.problemset.p92;

public class RobotMove {
    public int movingCount(int threshold, int row, int col) {
        if (threshold < 0 || row <= 0 || col <= 0) {
            return 0;
        }

        boolean[][] flag = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                flag[i][j] = false;
            }
        }
        return movingCount(threshold, row, col, 0, 0, flag);
    }

    private int movingCount(int threshold, int row, int col, int x, int y, boolean[][] flag) {
        int cnt = 0;
        if (x >= 0 && x < row && y >= 0 && y < col && !flag[x][y] &&
                getDigitalSum(x) + getDigitalSum(y) <= threshold) {
            flag[x][y] = true;
            cnt = 1 + movingCount(threshold, row, col, x - 1, y, flag) +
                    movingCount(threshold, row, col, x + 1, y, flag) +
                    movingCount(threshold, row, col, x, y - 1, flag) +
                    movingCount(threshold, row, col, x, y + 1, flag);
        }
        return cnt;
    }

    private int getDigitalSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
}
