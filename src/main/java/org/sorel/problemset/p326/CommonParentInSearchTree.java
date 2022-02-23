package org.sorel.problemset.p326;

import org.sorel.structure.TreeNode;

public class CommonParentInSearchTree {
    public int commonParentInSearchTreeIterative(TreeNode root, int p, int q) {
        if (root == null) {
            return 0;
        }

        TreeNode current = root;
        while (true) {
            if (current.val > p && current.val > q) {
                current = current.left;
            } else if (current.val < p && current.val < q) {
                current = current.right;
            } else {
                break;
            }
        }
        return current.val;
    }

    public int commonParentInSearchTreeRecursive(TreeNode root, int p, int q) {
        if (root == null) {
            return 0;
        }

        if (root.val >= p && root.val <= q || root.val >= q && root.val <= p) {
            return root.val;
        } else if (root.val > p && root.val > q) {
            return commonParentInSearchTreeRecursive(root.left, p, q);
        } else if (root.val < p && root.val < q) {
            return commonParentInSearchTreeRecursive(root.right, p, q);
        }
        return 0;
    }
}
