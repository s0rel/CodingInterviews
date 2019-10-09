package org.sorel.problemset.p273;

import org.sorel.structures.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isBalanced(root, new int[]{0});
    }

    private static boolean isBalanced(TreeNode node, int[] depth) {
        if (node == null) {
            depth[0] = 0;
            return true;
        }

        int[] left = new int[]{0};
        int[] right = new int[]{0};
        if (isBalanced(node.left, left) && isBalanced(node.right, right)) {
            int diff = left[0] - right[0];
            if (diff <= 1 && diff >= -1) {
                depth[0] = 1 + Math.max(left[0], right[0]);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
