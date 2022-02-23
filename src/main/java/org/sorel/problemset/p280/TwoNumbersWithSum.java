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
        int currSum = arr[l] + arr[r];
        while (currSum != sum && l < r) {
            if (currSum > sum) {
                r--;
            } else {
                l++;
            }
            currSum = arr[l] + arr[r];
        }

        if (currSum == sum) {
            res.add(arr[l]);
            res.add(arr[r]);
        }
        return res;
    }
}
