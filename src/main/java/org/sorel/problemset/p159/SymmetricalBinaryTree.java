package org.sorel.problemset.p159;

import org.sorel.structures.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricalBinaryTree {
    public boolean isSymmetrical(TreeNode root) {
        return isSymmetricalIteratively(root);
    }

    private boolean isSymmetricalIteratively(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();

            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null || node1.val != node2.val) {
                return false;
            }

            queue.offer(node1.left);
            queue.offer(node2.right);
            queue.offer(node1.right);
            queue.offer(node2.left);
        }
        return true;
    }

    private boolean isSymmetricalRecursively(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return isSymmetricalRecursively(root1.left, root2.right) && isSymmetricalRecursively(root1.right, root2.left);
    }
}
