package org.sorel.problemset.p077;

public class JumpFloor {
    public int jumpFloor(int n) {
        if (n <= 2) {
            return n;
        }

        int t1 = 1, t2 = 2, res = 0;
        for (int i = 3; i <= n; i++) {
            res = t1 + t2;
            t1 = t2;
            t2 = res;
        }
        return res;
    }
}
