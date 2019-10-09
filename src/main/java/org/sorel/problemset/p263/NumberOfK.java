package org.sorel.problemset.p263;

public class NumberOfK {
    public int getNumberOfK(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int l = getFirstK(arr, k);
        if (l == -1) {
            return 0;
        }

        int r = getLastK(arr, l, k);
        return r - l + 1;
    }

    private int getFirstK(int[] arr, int k) {
        if (arr[0] > k || arr[arr.length - 1] < k) return -1;

        int l = 0, r = arr.length - 1, m;
        while (l <= r) {
            if (r == l) {
                return (arr[l] == k) ? l : -1;
            }

            // 当长度为 2，mid 取左值
            m = l + (r - l) / 2;
            if (arr[m] > k) {
                r = m - 1;
            } else if (arr[m] < k) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return -1;
    }

    private int getLastK(int[] arr, int l, int k) {
        int r = arr.length - 1, m;
        while (l <= r) {
            if (r == l) {
                return (arr[l] == k) ? l : -1;
            }

            // 当长度为 2，mid 取右值
            m = l + (r - l + 1) / 2;
            if (arr[m] > k) {
                r = m - 1;
            } else if (arr[m] < k) {
                l = m + 1;
            } else {
                l = m;
            }
        }
        return -1;
    }
}
