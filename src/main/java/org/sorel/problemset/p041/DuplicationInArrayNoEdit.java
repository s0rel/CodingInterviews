package org.sorel.problemset.p041;

public class DuplicationInArrayNoEdit {
    /**
     * 不保证找出所有重复的数字
     */
    public int findDuplicateNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int len = arr.length;

        // 确保数组内的值都在允许的范围内
        for (int i : arr) {
            if (i < 1 || i > len) {
                return -1;
            }
        }

        int l = 1, m = 0, r = len - 1, cnt = 0;

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

    /**
     * 统计数组 arr 内大于等于 l 且小于等于 r 的元素的数量
     */
    private int counter(int[] arr, int l, int r) {
        int cnt = 0;
        for (int i : arr) {
            if (i >= l && i <= r) {
                cnt++;
            }
        }
        return cnt;
    }
}
