package org.sorel.problemset.p278;

/*
 * 如果一个数字出现 3 次，那么它的二进制位表示的每一个位（0或者1）也出现 3 次。
 * 如果把所有出现 3 次的数字的二进制表示的每一位都分别加起来，那么每一位的和都
 * 能被 3 整除。
 * 把数组中所有数字的二进制表示的每一位都加起来，如果某一位的和能被 3 整除，那么
 * 那个只出现一次的数字二进制表示中对应的那一位为 0，否则为 1。
 */
public class NumberAppearingOnce {
    public int findNumberAppearOnce(int[] data) {
        if (data == null || data.length < 3) { // 为了方便返回 0，但其实并不能区分异常
            return 0;
        }

        int[] bitSum = new int[32];
        int k = 3;
        for (int val : data) {
            int bitMask = 1;
            for (int j = 31; j >= 0; j--) {
                if ((val & bitMask) != 0) {
                    bitSum[j] += 1;
                }
                bitMask <<= 1;
            }
        }

        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1; // 先移位
            res += (bitSum[i] % k);
        }
        return res;
    }
}
