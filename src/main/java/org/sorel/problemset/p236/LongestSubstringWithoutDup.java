package org.sorel.problemset.p236;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDup {
    public int longestSubstringWithoutDup(String str) {
        if (str == null || str.length() == 0) return 0;

        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();

        int res = 0, start = 0, len = charArray.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(charArray[i])) {
                start = Math.max(map.put(charArray[i], i) + 1, start);
            }

            map.put(charArray[i], i);
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}
