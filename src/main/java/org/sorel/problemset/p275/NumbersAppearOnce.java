package org.sorel.problemset.p275;

public class NumbersAppearOnce {
    public int[] findNumsAppearOnce(int[] arr) {
        int result = 0;
        for (int val : arr) {
            result ^= val;
        }
        int indexOf1 = findFirstBit1(result);
        int[] res = new int[]{0, 0};
        if (indexOf1 < 0) {
            return res;
        }
        for (int val : arr) {
            if ((val & indexOf1) == 0) {
                res[0] ^= val;
            } else {
                res[1] ^= val;
            }
        }
        return res;
    }

    private int findFirstBit1(int num) {
        if (num < 0) {
            return -1;
        }
        int indexOf1 = 1;
        while (num != 0) {
            if ((num & 1) == 1) {
                return indexOf1;
            } else {
                num = num >> 1;
                indexOf1 *= 2;
            }
        }
        return -1;
    }
}
