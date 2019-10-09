package org.sorel.problemset.p199;

import java.util.ArrayList;
import java.util.List;

public class StringCombination {
    public List<String> combination(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }

        List<String> res = new ArrayList<>();
        combination(str.toCharArray(), res, new StringBuilder(), 0);
        return res;
    }

    private void combination(char[] charArray, List<String> res, StringBuilder s, int curr) {
        if (curr == charArray.length) {
            if (s.length() > 0) {
                res.add(s.toString());
            }
        } else if (curr + 1 == charArray.length || charArray[curr] != charArray[curr + 1]) {
            combination(charArray, res, s.append(charArray[curr]), curr + 1);
            s.deleteCharAt(s.length() - 1);
            combination(charArray, res, s, curr + 1);
        } else {
            int dumplicationStart = curr;
            while (curr != charArray.length && charArray[dumplicationStart] == charArray[curr]) {
                s.append(charArray[curr]);
                curr++;
            }

            int newStart = curr;
            while (curr >= dumplicationStart) {
                combination(charArray, res, s, newStart);
                if (curr != dumplicationStart) {
                    s.deleteCharAt(s.length() - 1);
                }
                curr--;
            }
        }
    }
}
