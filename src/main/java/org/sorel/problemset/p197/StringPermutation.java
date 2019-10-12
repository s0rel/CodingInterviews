package org.sorel.problemset.p197;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutation {
    public List<String> permutation(String str) {
        List<String> res = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return res;
        }

        char[] charArray = str.toCharArray();
        Set<String> set = new HashSet<>();
        StringBuilder path = new StringBuilder();
        boolean[] visited = new boolean[charArray.length];
        combination(charArray, 0, path, visited, set);
        res.addAll(set);
        return res;
    }

    private void combination(char[] charArray, int idx, StringBuilder path, boolean[] visited, Set<String> set) {
        if (idx == charArray.length) {
            set.add(path.toString());
            return;
        }

        for (int i = 0; i < charArray.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                path.append(charArray[i]);
                combination(charArray, idx + 1, path, visited, set);
                visited[i] = false;
                path.deleteCharAt(path.length() - 1);
            }
        }
    }
}
