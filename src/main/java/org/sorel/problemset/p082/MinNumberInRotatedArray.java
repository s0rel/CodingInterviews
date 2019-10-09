package org.sorel.problemset.p082;

public class MinNumberInRotatedArray {
    public int minNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int l = 0, m = 0, r = arr.length - 1;
        if (arr[l] < arr[r]) {
            return arr[l];
        }

        while (true) {
            if (r - l == 1) {
                m = r;
                break;
            }

            m = l + (r - l) / 2;

            if (arr[m] == arr[l] && arr[m] == arr[r]) {
                int res = arr[l];
                for (int i = l + 1; i < r; i++) {
                    if (res > arr[i]) {
                        res = arr[i];
                    }
                }
                return res;
            }

            if (arr[m] >= arr[l]) {
                l = m;
            } else if (arr[m] <= arr[r]) {
                r = m;
            }
        }
        return arr[m];
    }
}
