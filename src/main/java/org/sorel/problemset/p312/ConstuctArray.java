package org.sorel.problemset.p312;

public class ConstuctArray {
    public int[] multiply(int[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }

        int[] res = new int[arr.length];
        res[0] = 1;
        for (int i = 1; i < res.length; i++)
            res[i] = res[i - 1] * arr[i - 1];
        int temp = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            temp = temp * arr[i + 1];
            res[i] = res[i] * temp;
        }
        return res;
    }
}
