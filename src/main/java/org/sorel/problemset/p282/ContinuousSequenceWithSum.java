package org.sorel.problemset.p282;

import java.util.ArrayList;
import java.util.List;

public class ContinuousSequenceWithSum {
    public List<List<Integer>> findContinuousSequence(int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (sum < 3) {
            return res;
        }

        int small = 1, big = 2, threshold = sum >> 1;
        int currSum = small + big;
        while (small <= threshold) {
            if (currSum == sum) {
                res.add(continousSequence(small, big));
                big++;
                currSum += big;
            } else if (currSum < sum) {
                big++;
                currSum += big;
            } else {
                currSum -= small;
                small++;
            }
        }
        return res;
    }

    private List<Integer> continousSequence(int small, int big) {
        List<Integer> res = new ArrayList<>();
        for (int i = small; i <= big; i++) {
            res.add(i);
        }
        return res;
    }
}
