package org.sorel.problemset.p269;

import org.sorel.structures.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class KthNodeInBST {
    public TreeNode kthNode(TreeNode root, int k) {
        if (root == null || k < 0) {
            return null;
        }

        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        int cnt = 0;
        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                curr = stack.pop();
                cnt++;
                if (cnt == k) {
                    return curr;
                }
                curr = curr.right;
            }
        }
        return null;
    }
}
