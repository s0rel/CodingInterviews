package org.sorel.problemset.p266;

public class MissingNumber {
    public int getMissingNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int l = 0;
        int r = arr.length - 1;
        int m;

        while (l <= r) {
            m = l + ((r - l) >> 1);
            if (arr[m] > m) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}
