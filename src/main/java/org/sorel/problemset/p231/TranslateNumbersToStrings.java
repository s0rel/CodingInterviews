package org.sorel.problemset.p231;

/*
 * 用 dp[i] 表示从第 i 位数字开始的不同翻译的数目，那么
 * dp[i] = dp[i + 1] + g(i, i + 1) * dp[i + 2]。
 * 当第 i 位和第 i + 1 位两位数字拼接起来的数字在 10 ~ 25
 * 范围内时，g(i, i + 1) 为 1，否则为 0。
 */
public class TranslateNumbersToStrings {
    public int getTranslationCount(int num) {
        if (num < 0) {
            return 0;
        }

        String strNum = Integer.toString(num);
        int len = strNum.length();
        int[] dp = new int[len];
        dp[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            dp[i] = dp[i + 1];
            int a = strNum.charAt(i) - '0';
            int b = strNum.charAt(i + 1) - '0';
            int combinedNum = a * 10 + b;
            if (combinedNum >= 10 && combinedNum <= 25) {
                if (i == len - 2) {
                    dp[i] += 1;
                } else {
                    dp[i] += dp[i + 2];
                }
            }
        }
        return dp[0];
    }
}
