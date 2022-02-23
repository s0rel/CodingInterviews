package org.sorel.problemset.p209;

import org.sorel.util.CommonUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KLeastNumbers {
    public List<Integer> getLeastNumbers(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            return res;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int val : arr) {
            queue.add(val);
        }
        while (k != 0) {
            res.add(queue.remove());
            k--;
        }
        return res;
    }

    public List<Integer> getLeastNumbersHeap(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            return res;
        }

        // 初次排序，完成 k 个元素的排序
        for (int i = 1; i < k; i++) {
            int j = i - 1;
            int unFindElement = arr[i];
            while (j >= 0 && arr[j] > unFindElement) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = unFindElement;
        }

        // 遍历后面的元素，进行 k 个元素的更新和替换
        int len = arr.length;
        for (int i = k; i < len; i++) {
            if (arr[i] < arr[k - 1]) {
                int newK = arr[i];
                int j = k - 1;
                while (j >= 0 && arr[j] > newK) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = newK;
            }
        }

        // 把前 k 个元素返回
        for (int i = 0; i < k; i++) {
            res.add(arr[i]);
        }
        return res;
    }

    public List<Integer> getLeastNumbersPartition(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            return res;
        }

        int l = 0, r = arr.length - 1;
        int idx = partition(arr, l, r);
        while (idx != k - 1) {
            if (idx < k - 1) {
                l = idx + 1;
            } else {
                r = idx - 1;
            }
            idx = partition(arr, l, r);
        }

        for (int i = 0; i <= idx; i++) {
            res.add(arr[i]);
        }
        return res;
    }

    private int partition(int[] arr, int l, int r) {
        int i = l, j = r + 1;
        int v = arr[l];
        while (true) {
            while (i < r && arr[++i] < v) ;
            while (j > 0 && v < arr[--j]) ;
            if (i >= j) {
                break;
            }
            CommonUtils.swap(arr, i, j);
        }
        CommonUtils.swap(arr, l, j);
        return j;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
