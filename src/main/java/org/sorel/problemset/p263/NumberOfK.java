package org.sorel.problemset.p263;

public class NumberOfK {
    public int getNumberOfK(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // 通过引入浮点数，只需要找出数组中第一个大于k和最后一个小于k的数的下标相减就可以获得k在数组中的长度
        return getFirstIndexOfK(arr, k + 0.5) - getFirstIndexOfK(arr, k - 0.5);
    }

    /**
     * 通过二分法找到num在arr的第一个下标，如果找不到目标值，则返回第一个大于目标值的数的下标
     */
    private int getFirstIndexOfK(int[] arr, double num) {
        int l = 0;
        int r = arr.length - 1;
        int m = 0;

        while (l <= r) {
            m = l + ((r - l) >> 1);
            if (arr[m] < num) {
                l = m + 1;
            } else if (arr[m] > num) {
                r = m - 1;
            }
        }
        return l;
    }
}
