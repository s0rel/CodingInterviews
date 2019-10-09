package org.sorel.problemset.p218;

public class GreatestSumOfSubarrays {
    public int greatestSumOfSubarrays(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int curSum = arr[0], sum = arr[0], len = arr.length;
        for (int i = 1; i < len; i++) { // 这里的下标从 1 开始
            if (curSum <= 0) {
                curSum = arr[i];
            } else {
                curSum += arr[i];
            }

            if (curSum > sum) {
                sum = curSum;
            }
        }
        return sum;
    }
}
