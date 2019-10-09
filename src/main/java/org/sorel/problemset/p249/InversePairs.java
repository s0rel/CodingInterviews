package org.sorel.problemset.p249;

public class InversePairs {
    public int inversePairs(int[] arr) {
        if (arr == null || arr.length < 2) return 0;
        return mergeSort(arr, 0, arr.length - 1);
    }

    public int mergeSort(int[] arr, int start, int end) {
        if (start >= end) return 0;

        int mid = start + (end - start) / 2;
        int left = mergeSort(arr, start, mid);
        int right = mergeSort(arr, mid + 1, end);
        int count = merge(arr, start, mid, end);
        return left + right + count;
    }

    public int merge(int[] arr, int start, int mid, int end) {
        int[] newArray = new int[end - start + 1];
        if (end - start + 1 >= 0)
            System.arraycopy(arr, start, newArray, 0, end - start + 1);
        int left = 0, right = mid + 1 - start, index = start, count = 0;
        while (left <= mid - start && right <= end - start) {
            if (newArray[left] <= newArray[right]) {
                arr[index++] = newArray[left++];
            } else {
                arr[index++] = newArray[right++];
                count += (mid - start) - left + 1;
            }
        }
        while (left <= mid - start) {
            arr[index++] = newArray[left++];
        }
        while (right <= end - start) {
            arr[index++] = newArray[right++];
        }
        return count;
    }
}
