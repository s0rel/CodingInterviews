package org.sorel.problemset.p074;

public class Fibonacci {
    public int fibonacci(int n) {
        if (n < 2) {
            return n;
        }

        int t1 = 0, t2 = 1, res = 0;
        for (int i = 2; i <= n; i++) {
            res = t1 + t2;
            t1 = t2;
            t2 = res;
        }
        return res;
    }
}
