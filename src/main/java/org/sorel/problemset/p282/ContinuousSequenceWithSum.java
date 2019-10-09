package org.sorel.problemset.p282;

public class ContinuousSequenceWithSum {
    public void findContinuousSequence(int sum) {
        if (sum < 3) {
            return;
        }

        int small = 1, big = 2, middle = sum >> 1;
        int curSum = small + big;
        while (small <= middle) {
            if (curSum == sum) {
                printContinousSequence(small, big);
                big++;
                curSum += big;
            } else if (curSum < sum) {
                big++;
                curSum += big;
            } else {
                curSum -= small;
                small++;
            }
        }
    }

    private void printContinousSequence(int small, int big) {
        for (int i = small; i <= big; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
