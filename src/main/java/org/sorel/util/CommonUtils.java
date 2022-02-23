package org.sorel.util;

public class CommonUtils {
    /**
     * 交换数组内的元素
     *
     * @param arr 数组
     * @param i   数组下标
     * @param j   数组下标
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
