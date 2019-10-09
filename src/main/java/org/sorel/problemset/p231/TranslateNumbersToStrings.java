package org.sorel.problemset.p231;

public class TranslateNumbersToStrings {
    public int getTranslationCount(int num) {
        if (num < 0) return 0;
        String strNum = String.valueOf(num);
        int len = strNum.length();
        int[] dp = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                dp[i] = 1;
            } else {
                dp[i] = dp[i + 1];
                int a = strNum.charAt(i) - '0';
                int b = strNum.charAt(i + 1) - '0';
                int convertNum = a * 10 + b;
                if (convertNum >= 10 && convertNum <= 25) {
                    if (i == len - 2) {
                        dp[i] += 1;
                    } else {
                        dp[i] += dp[i + 2];
                    }
                }
            }
        }
        return dp[0];
    }
}
