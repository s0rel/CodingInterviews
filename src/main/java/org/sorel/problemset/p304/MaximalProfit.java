package org.sorel.problemset.p304;


public class MaximalProfit {
    public int maximalProfit(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0;
        }

        int min = arr[0];
        int maxDiff = arr[1] - min;
        if (arr[1] < min) {
            min = arr[1];
        }
        for (int i = 2; i < arr.length; i++) {
            // 必须先计算 maxDiff，然后再计算 min
            if (arr[i] - min > maxDiff) {
                maxDiff = arr[i] - min;
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return maxDiff;
    }
}
