package org.sorel.problemset.p221;

public class NumberOf1 {
    public int numberOf1(int n) {
        if (n <= 0) {
            return 0;
        }

        int curr = 0, prev = 0, post = 0;
        int cnt = 0;
        int i = 1;
        while (n / i != 0) {
            curr = (n / i) % 10; // 当前位
            prev = n / (i * 10); // 高位
            post = n - (n / i) * i; // 低位
            if (curr == 0) {
                cnt += prev * i;
            } else if (curr == 1) {
                cnt = cnt + prev * i + post + 1;
            } else if (curr > 1) {
                cnt = cnt + (prev + 1) * i;
            }
            i = i * 10;
        }
        return cnt;
    }
}
