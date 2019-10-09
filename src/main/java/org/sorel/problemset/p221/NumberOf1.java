package org.sorel.problemset.p221;

public class NumberOf1 {
    public int numberOf1(int n) {
        if (n <= 0) {
            return 0;
        }

        int cnt = 0;
        for (int i = 1; i <= n; i *= 10) {
            cnt += (n / (10 * i)) * i;
            int mod = n % (10 * i);
            if (mod > 2 * i - 1) {
                cnt += i;
            } else {
                if (mod >= i) {
                    cnt += (mod - i) + 1;
                }
            }
        }
        return cnt;
    }
}
