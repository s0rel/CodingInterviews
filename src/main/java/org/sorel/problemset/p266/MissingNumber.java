package org.sorel.problemset.p266;

public class MissingNumber {
    public int getMissingNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int l = 0, r = arr.length - 1, m;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (arr[m] == m) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }
}
