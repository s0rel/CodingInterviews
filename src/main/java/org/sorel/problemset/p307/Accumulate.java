package org.sorel.problemset.p307;

public class Accumulate {
    public int getSum(int num) {
        int t = 0;
        boolean b = (num > 0) && ((t = num + getSum(num - 1)) > 0);
        return t;
    }
}
