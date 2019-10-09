package org.sorel.problemset.p278;

public class NumberAppearingOnce {
    public int findNumberAppearOnce(int[] data) {
        if (data == null || data.length < 3) { // 为了方便返回 0，但其实并不能区分异常
            return 0;
        }

        int[] bitSum = new int[32];
        int k = 3;
        for (int val : data) {
            int indexOfBit1 = 1;
            for (int j = 31; j >= 0; j--) {
                if ((val & indexOfBit1) != 0) {
                    bitSum[j] += 1;
                }
                indexOfBit1 <<= 1;
            }
        }

        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1; // 先移位
            res += bitSum[i] % k;
        }
        return res;
    }
}
