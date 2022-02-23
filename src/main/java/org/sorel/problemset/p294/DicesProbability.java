package org.sorel.problemset.p294;

public class DicesProbability {
    public void printProbability(int n) {
        if (n <= 0) {
            return;
        }

        int[][] res = new int[2][6 * n + 1];
        for (int i = 1; i <= 6; i++) {
            res[1][i] = 1;
        }
        for (int num = 2; num <= n; num++) {
            for (int i = num; i < 6 * num + 1; i++) {
                for (int j = i - 6; j < i; j++)
                    if (j > 0) {
                        res[num % 2][i] += res[(num - 1) % 2][j];
                    }
            }
        }

        double sum = 0;
        for (int i = n; i < 6 * n + 1; i++) {
            sum += res[n % 2][i];
        }
        System.out.println("number = " + n);
        for (int i = n; i < 6 * n + 1; i++) {
            System.out.println("probability " + i + ":" + res[n % 2][i] / sum);
        }
    }
}
