package org.sorel.problemset.p100;

public class NumberOf1InBinary {
    /**
     * 把一个整数减 1，之后再和原来的整数做 & 运算，得到的结果相当于把整数的二进制表示中最右边的 1 变成 0
     */
    public int numberOfOne(int n) {
        int cnt = 0;
        while (n != 0) {
            n = n & (n - 1);
            cnt++;
        }
        return cnt;
    }
}
