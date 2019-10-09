package org.sorel.problemset.p282;

import org.junit.Test;

public class TestContinuousSequenceWithSum {
    @Test
    public void test() {
        ContinuousSequenceWithSum sol = new ContinuousSequenceWithSum();
        sol.findContinuousSequence(1);
        System.out.println();
        sol.findContinuousSequence(3);
        System.out.println();
        sol.findContinuousSequence(4);
        System.out.println();
        sol.findContinuousSequence(9);
        System.out.println();
        sol.findContinuousSequence(15);
        System.out.println();
        sol.findContinuousSequence(100);
    }
}
