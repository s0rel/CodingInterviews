package org.sorel.problemset.p78;

public class JumpFloor_II {
    public int jumpFloor(int n) {
        if (n == 0) {
            return 0;
        }
        return (int) Math.pow(2, n - 1);
    }
}
