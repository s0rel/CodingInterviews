package org.sorel.problemset.p124;

public class RegularExpressionsMatching {
    public boolean match(String str, String pattern) {
        if (str == null || pattern == null) {
            return false;
        }
        return match(str.toCharArray(), pattern.toCharArray(), 0, 0);
    }

    private boolean match(char[] strArray, char[] patternArray, int strIdx, int patternIdx) {
        if (strIdx == strArray.length && patternIdx == patternArray.length) {
            return true;
        }

        // 模式串比文本串先到末尾，肯定没有匹配成功
        if (patternIdx == patternArray.length && strIdx < strArray.length) {
            return false;
        }

        // 第二个字符是 *
        if (patternIdx < patternArray.length - 1 && patternArray[patternIdx + 1] == '*') {
            if ((strIdx < strArray.length) && (patternArray[patternIdx] == strArray[strIdx] ||
                    patternArray[patternIdx] == '.')) {
                return match(strArray, patternArray, strIdx, patternIdx + 2) ||
                        match(strArray, patternArray, strIdx + 1, patternIdx + 2) ||
                        match(strArray, patternArray, strIdx + 1, patternIdx);
            } else {
                return match(strArray, patternArray, strIdx, patternIdx + 2);
            }
        }

        // 第二个字符不是 *
        if ((strIdx < strArray.length) && (patternArray[patternIdx] == strArray[strIdx] ||
                patternArray[patternIdx] == '.')) {
            return match(strArray, patternArray, strIdx + 1, patternIdx + 1);
        }
        return false;
    }
}
