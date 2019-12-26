package org.sorel.problemset.p236;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDup {
    public int longestSubstringWithoutDup(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int res = 0, start = 0, len = str.length();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(str.charAt(i))) {
                start = Math.max(map.get(str.charAt(i)), start);
            }
            res = Math.max(res, i - start + 1);
            map.put(str.charAt(i), i + 1);
        }
        return res;
    }
}
