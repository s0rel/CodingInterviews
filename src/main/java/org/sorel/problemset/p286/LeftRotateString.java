package org.sorel.problemset.p286;

public class LeftRotateString {
    public String leftRotateString(String str, int n) {
        if (str == null || str.length() == 0) {
            return str;
        }

        int len = str.length();
        int movedLen = n % len;
        return str.substring(movedLen) + str.substring(0, movedLen);
    }
}
