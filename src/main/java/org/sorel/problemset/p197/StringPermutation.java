package org.sorel.problemset.p197;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class StringPermutation {
    public List<String> permutation(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }

        List<String> res = new LinkedList<>();
        permutation(str.toCharArray(), res, 0);
        return res;
    }

    private void permutation(char[] charArray, List<String> res, int bound) {
        if (bound == charArray.length) {
            res.add(new String(charArray));
        }

        Set<Character> set = new HashSet<>();
        int len = charArray.length;
        for (int i = bound; i < len; i++) {
            if (set.add(charArray[i])) {
                swap(charArray, bound, i);
                permutation(charArray, res, bound + 1);
                swap(charArray, bound, i);
            }
        }
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
