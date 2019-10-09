package org.sorel.problemset.p39;

import java.util.HashMap;
import java.util.Map;

public class DuplicationInArray_I {
    public int findDuplicateNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int res = -1;
        for (int n : map.keySet()) {
            if (map.get(n) > 1) {
                res = n;
                break;
            }
        }
        return res;
    }
}
