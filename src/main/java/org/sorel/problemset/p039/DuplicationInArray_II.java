package org.sorel.problemset.p039;

import org.sorel.util.CommonUtils;

public class DuplicationInArray_II {
    public int findDuplicateNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int len = arr.length;

        // 确保数组内的值都在允许的范围内
        for (int i : arr) {
            if (i < 0 || i > len - 1) {
                return -1;
            }
        }

        /**
         * 当扫描到下标为 i 的数字，首先比较这个数字（用 m 表示）是不是等于 i。如果是，则继续扫描下一个数字；
         * 如果不是，则再拿它和第 m 个数字做比较。如果它和第 m 个数字相等，就找到了一个重复的数字；如果它和
         * 第 m 个数字不相等，就把第 i 个数字和第 m 个数字交换，把 m 放到属于它的位置。接下来重复这个重复、
         * 比较的过程，直到发现第一个重复的数字。
         */
        for (int i = 0; i < len; i++) {
            while (arr[i] != i) {
                if (arr[i] == arr[arr[i]]) {
                    return arr[i];
                } else {
                    CommonUtils.swap(arr, i, arr[i]);
                }
            }
        }
        return -1;
    }
}
