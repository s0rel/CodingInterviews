package org.sorel.problemset.p280;

import java.util.ArrayList;
import java.util.List;

public class TwoNumbersWithSum {
    public List<Integer> findNumbersWithSum(int[] arr, int sum) {
        List<Integer> res = new ArrayList<>();
        if (arr == null || arr.length < 2) {
            return res;
        }

        int l = 0, r = arr.length - 1;
        int curSum = arr[l] + arr[r];
        while (curSum != sum && l < r) {
            if (curSum > sum) {
                r--;
            } else {
                l++;
            }
            curSum = arr[l] + arr[r];
        }

        if (curSum == sum) {
            res.add(arr[l]);
            res.add(arr[r]);
        }
        return res;
    }
}
