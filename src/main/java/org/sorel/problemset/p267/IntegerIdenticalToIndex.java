package org.sorel.problemset.p267;

public class IntegerIdenticalToIndex {
    public int getNumberSameAsIndex(int[] arr) {
        if (arr == null || arr.length == 0 || arr[0] > 0 || arr[arr.length - 1] < 0) {
            return -1;
        }

        int l = 0;
        int r = arr.length - 1;
        int m;

        while (l <= r) {
            m = l + ((r - l) >> 1);
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
