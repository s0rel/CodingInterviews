package org.sorel.problemset.p127;

/**
 * 表示数值的字符串遵循模式A[.[B]][e|EC]或者.B[e|EC]，其中A为数值的整数部分，
 * B为紧跟着小数点为数值的小数部分，C为紧跟着'e'或者'E'为数值的指数部分。
 */
public class NumericStrings {
    public boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }

        str = str.trim();
        int index;
        if (str.charAt(0) != '.') {
            index = scanInteger(str, 0);
            if (index == -1) {
                return false;
            }
            if (index == str.length()) {
                return true;
            }
            if (str.charAt(index) == '.') {
                if (index == str.length() - 1) {
                    return true;
                }
                index = scanInteger(str, index + 1);
                if (index == str.length()) {
                    return true;
                }
            }
            if (str.charAt(index) == 'e' || str.charAt(index) == 'E') {
                index = scanInteger(str, index + 1);
                return index == str.length();
            }
            return false;
        } else {
            index = scanInteger(str, 1);
            if (index == -1) {
                return false;
            }
            if (index == str.length()) {
                return true;
            }
            if (str.charAt(index) == 'e' || str.charAt(index) == 'E') {
                index = scanInteger(str, index + 1);
                return index == str.length();
            }
            return false;
        }
    }

    private int scanInteger(String str, Integer index) {
        if (index >= str.length()) {
            return -1;
        }
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            return scanUnsignedInteger(str, index + 1);
        } else {
            return scanUnsignedInteger(str, index);
        }
    }

    private int scanUnsignedInteger(String str, Integer index) {
        if (index >= str.length()) {
            return -1;
        }
        int origin = index;
        while (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
            index++;
            if (index == str.length()) {
                return index;
            }
        }
        if (origin == index) {
            index = -1;
        }
        return index;
    }
}
