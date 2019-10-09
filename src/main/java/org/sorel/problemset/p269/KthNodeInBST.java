package org.sorel.problemset.p269;

import org.sorel.structures.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class KthNodeInBST {
    public TreeNode kthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k < 0) {
            return null;
        }

        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = pRoot;
        int count = 0;
        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                curr = stack.pop();
                count++;
                if (count == k) {
                    return curr;
                }
                curr = curr.right;
            }
        }
        return null;
    }
}
