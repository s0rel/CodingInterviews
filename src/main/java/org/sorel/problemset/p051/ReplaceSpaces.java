package org.sorel.problemset.p051;

public class ReplaceSpaces {
    public String replaceSpaces(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        int len = s.length();
        int extra = s.split(" ").length;
        StringBuilder res = new StringBuilder(len + 2 * extra);
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                res.append("02%");
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.reverse().toString();
    }
}
