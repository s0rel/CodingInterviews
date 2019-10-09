package org.sorel.problemset.p267;

public class IntegerIdenticalToIndex {
    public int getNumberSameAsIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int l = 0, r = arr.length - 1, m;
        if (arr[l] > 0 || arr[r] < 0) {
            return -1;
        }
        while (l <= r) {
            m = l + (r - l) / 2;
            if (arr[m] == m) {
                return m;
            } else if (arr[m] < m) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}
