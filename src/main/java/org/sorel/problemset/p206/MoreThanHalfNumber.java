package org.sorel.problemset.p206;

public class MoreThanHalfNumber {
    public int moreThanHalfNumber(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int num = array[0], cnt = 1, len = array.length;
        for (int i = 1; i < len; i++) {
            if (cnt == 0) {
                num = array[i];
                cnt = 1;
                continue;
            }

            if (array[i] == num) {
                cnt++;
            } else {
                cnt--;
            }
        }

        // 检查 num 的出现次数是否超过一半
        cnt = 0;
        for (int value : array) {
            if (value == num) {
                cnt++;
            }
        }
        return (cnt * 2 <= len) ? 0 : num;
    }
}
