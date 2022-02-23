package org.sorel.problemset.p129;

import org.sorel.util.CommonUtils;

public class ReorderArray {
    public void Reorder(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int l = 0, r = arr.length - 1;
        while (l < r) { // 这里不能取“=”
            while (l < r && !isEven(arr[l])) {
                l++;
            }
            while (l < r && isEven(arr[r])) {
                r--;
            }
            if (l < r) {
                CommonUtils.swap(arr, l, r);
            }
        }
    }

    private boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
