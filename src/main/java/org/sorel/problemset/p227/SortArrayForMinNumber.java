package org.sorel.problemset.p227;

import java.util.Arrays;

public class SortArrayForMinNumber {
    public void minNumber(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int len = nums.length;
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = "" + nums[i];
        }

        Arrays.sort(arr, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        StringBuilder res = new StringBuilder();
        for (String s : arr) {
            res.append(s);
        }
        System.out.println(res.toString());
    }
}
