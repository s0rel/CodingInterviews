package org.sorel.problemset.p39;

public class DuplicationInArray_II {
    public int findDuplicateNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int len = arr.length;
        for (int i = 0; i < len; i++) {
            while (arr[i] != i) {
                if (arr[i] == arr[arr[i]]) {
                    return arr[i]; // break 只能跳出这里的 while，跳不出这里的 for
                } else {
                    swap(arr, i, arr[i]);
                }
            }
        }
        return -1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
