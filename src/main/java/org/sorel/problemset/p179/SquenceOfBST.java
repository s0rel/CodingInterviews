package org.sorel.problemset.p179;

public class SquenceOfBST {
    public boolean verifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return verifySquenceOfBST(sequence, 0, sequence.length - 1);
    }

    private boolean verifySquenceOfBST(int[] sequence, int start, int end) {
        if (start >= end) {
            return true;
        }

        int root = sequence[end], split = start;

        for (; split < end && sequence[split] < root; split++) ;
        for (int i = split; i < end; i++) {
            if (sequence[i] < root) {
                return false;
            }
        }

        return verifySquenceOfBST(sequence, start, split - 1) &&
                verifySquenceOfBST(sequence, split, end - 1);
    }
}
