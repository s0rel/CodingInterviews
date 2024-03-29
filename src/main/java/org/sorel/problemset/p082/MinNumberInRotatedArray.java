package org.sorel.problemset.p082;

public class MinNumberInRotatedArray {
    public int minNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int l = 0, r = arr.length - 1;
        while (l < r) {
            if (arr[l] < arr[r]) {
                return arr[l];
            }

            int m = l + (r - l) / 2;
            if (arr[m] > arr[l]) {
                l = m + 1;
            } else if (arr[m] < arr[r]) {
                r = m;
            } else {
                l++;
            }
        }
        return arr[l];
    }
}
