package org.sorel.problemset.p206;

/*
 * 遍历到下一个数字时，如果下一个数字和之前保存的数字相同，则次数加 1；如果不同，
 * 次数减 1；如果次数为 0，需要保存下一个数字，并把次数设为 1。
 */
public class MoreThanHalfNumber {
    public int moreThanHalfNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int num = arr[0], cnt = 1, len = arr.length;
        for (int i = 1; i < len; i++) {
            if (cnt == 0) {
                num = arr[i];
                cnt = 1;
                continue;
            }

            if (arr[i] == num) {
                cnt++;
            } else {
                cnt--;
            }
        }

        // 检查 num 的出现次数是否超过一半
        cnt = 0;
        for (int value : arr) {
            if (value == num) {
                cnt++;
            }
        }
        return (cnt * 2 <= len) ? 0 : num;
    }
}
