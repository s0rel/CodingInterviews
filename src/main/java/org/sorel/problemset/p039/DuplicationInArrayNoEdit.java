package org.sorel.problemset.p039;

public class DuplicationInArrayNoEdit {
    public int findDuplicateNumber(int[] arr) {
        // 不保证找出所有重复的数字
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int len = arr.length;
        int l = 0, m = 0, r = len - 1, cnt = 0;

        // [l, r] 实际就是重复数字所在的区间，因此循环的条件是 l <= r
        while (l <= r) {
            m = l + (r - l) / 2;
            cnt = counter(arr, l, m);
            if (l == r) {
                if (cnt > 1) {
                    return l;
                } else {
                    break;
                }
            }

            if (cnt > (m - l + 1)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    private int counter(int[] arr, int l, int r) {
        int cnt = 0;
        for (int n : arr) {
            if (n >= l && n <= r) {
                cnt++;
            }
        }
        return cnt;
    }
}
