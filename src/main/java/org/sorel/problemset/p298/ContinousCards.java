package org.sorel.problemset.p298;

public class ContinousCards {
    public boolean isContinous(int[] arr) {
        if (arr == null || arr.length != 5) {
            return false;
        }

        int[] table = new int[14];
        for (int val : arr) {
            if (val > 13 || val < 0) {
                return false;
            }
            table[val]++;
        }
        if (table[0] == 5) { // 处理全是 0 的情况
            return true;
        }

        int idx = 1;
        while (table[idx] == 0) {
            idx++;
        }
        int king = table[0];
        for (int i = idx; i < idx + 5; i++) {
            if (i > 13) {
                break;
            }
            if (table[i] > 1) { // 处理对子的情况
                return false;
            } else if (table[i] == 0) { // 用大小王替代
                if (king == 0) {
                    return false;
                } else {
                    king--;
                }
            }
        }
        return true;
    }
}
