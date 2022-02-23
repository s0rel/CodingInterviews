package org.sorel.problemset.p275;

/*
 * 由于两个数字肯定不一样，那么异或的结果肯定不为0。在结果数字中找到第一个为1的位的位置，
 * 记为第n位。可以把第n位是不是1为标准把数组中的数字分成两个子数组。
 */
public class NumbersAppearOnce {
    public int[] findNumsAppearOnce(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum ^= val;
        }

        int indexOf1 = findFirstBit1(sum);
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
                num >>= 1;
                indexOf1 <<= 1;
            }
        }
        return -1;
    }
}
