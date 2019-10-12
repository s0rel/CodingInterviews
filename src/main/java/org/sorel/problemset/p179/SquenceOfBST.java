package org.sorel.problemset.p179;

/*
 * 在后序遍历得到的序列中，最后一个数字是树的根节点的值。数组中前面的数字可以分成两部分：
 * 第一部分是左子树节点的值，它们都比根节点的值要小；第一部分是右子树节点的值，它们都比
 * 根节点的值要大。
 */
public class SquenceOfBST {
    public boolean verifySquenceOfBST(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        return verifySquenceOfBST(arr, 0, arr.length - 1);
    }

    private boolean verifySquenceOfBST(int[] sequence, int start, int end) {
        if (start >= end) {
            return true;
        }

        int root = sequence[end], split = start;

        for (; split < end; split++) {
            if (sequence[split] > root) {
                break;
            }
        }
        for (int i = split; i < end; i++) {
            if (sequence[i] < root) {
                return false;
            }
        }

        return verifySquenceOfBST(sequence, start, split - 1) &&
                verifySquenceOfBST(sequence, split, end - 1);
    }
}
