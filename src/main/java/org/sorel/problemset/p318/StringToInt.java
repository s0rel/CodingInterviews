package org.sorel.problemset.p318;

public class StringToInt {
    public int strToInt(String s) {
        if (s == null || s.length() == 0 || s.trim().length() == 0) {
            return 0;
        }

        // 去除字符串前后的空格并提取标志位
        s = s.trim();
        String sign = s.charAt(0) == '+' || s.charAt(0) == '-' ? s.substring(0, 1) : "";

        // 处理不包含任何数字的情况
        int index = "".equals(sign) ? 0 : 1;
        if (index == s.length()) {
            return 0;
        }

        // 提取字符串中的数值部分
        StringBuilder numericalString = new StringBuilder();
        for (; index < s.length(); index++) {
            if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                numericalString.append(s.charAt(index));
            } else {
                break;
            }
        }

        // 转换结果，因为可能存在超出整型范围的情况，所以需要用long进行存储，并在每次累加后进行判断
        long result = 0;
        String numerical = "".contentEquals(numericalString) ? "0" : numericalString.toString();
        if ("-".equals(sign)) {
            for (int i = 0; i < numerical.length(); i++) {
                result = result * 10 + (-1) * (numerical.charAt(i) - '0');
                if (result < Integer.MIN_VALUE) {
                    result = Integer.MIN_VALUE;
                    break;
                }
            }
        } else {
            for (int i = 0; i < numerical.length(); i++) {
                result = result * 10 + numerical.charAt(i) - '0';
                if (result > Integer.MAX_VALUE) {
                    result = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        return (int) result;
    }
}
