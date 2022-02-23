package org.sorel.problemset.p157;

import org.sorel.structure.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class MirrorOfBinaryTree {
    public void mirrorIteratively(TreeNode root) {
        if (root == null) {
            return;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            swap(curr);

            if (curr.left != null) {
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                queue.offer(curr.right);
            }
        }
    }

    public void mirrorRecursively(TreeNode root) {
        if (root == null) {
            return;
        }

        swap(root);

        mirrorRecursively(root.left);
        mirrorRecursively(root.right);
    }

    private void swap(TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
