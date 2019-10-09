package org.sorel.problemset.p225;

public class DigitsInSequence {
    public int digitAtIndex(int idx) {
        if (idx < 0) {
            return -1;
        }
        if (idx < 10) {
            return idx;
        }

        int currIdx = 10, length = 2;
        int boundNum = 10;
        while (currIdx + lengthSum(length) < idx) {
            currIdx += lengthSum(length);
            boundNum *= 10;
            length++;
        }
        int addNum = (idx - currIdx) / length;
        int curNum = boundNum + addNum;
        return Integer.toString(curNum).charAt(idx - currIdx - addNum * length) - '0';
    }

    private int lengthSum(int length) {
        int cnt = 9;
        for (int i = 1; i < length; i++) {
            cnt *= 10;
        }
        return cnt * length;
    }
}
