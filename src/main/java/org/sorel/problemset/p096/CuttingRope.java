package org.sorel.problemset.p096;

public class CuttingRope {
    public int maxProduct(int len) {
        if (len < 2) {
            return 0;
        }
        if (len == 2) {
            return 1;
        }
        if (len == 3) {
            return 2;
        }

        int countOfThree = len / 3;
        if (len - 3 * countOfThree == 1) {
            countOfThree--;
        }
        int countOfTwo = (len - countOfThree * 3) / 2;
        return (int) Math.pow(3, countOfThree) * (int) Math.pow(2, countOfTwo);
    }
}
