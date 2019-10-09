package org.sorel.problemset.p284;

public class ReverseWordsInSentence {
    public String reverse(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.trim().length() == 0) {
            return str;
        }

        String[] arr = str.split(" ");
        StringBuilder res = new StringBuilder();
        int len = arr.length;
        for (int i = len - 1; i > 0; i--) {
            res.append(arr[i]).append(" ");
        }
        return res.append(arr[0]).toString();
    }
}
