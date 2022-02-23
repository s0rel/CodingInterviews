package org.sorel.problemset.p191;

import org.sorel.structure.TreeNode;

public class ConvertBinarySearchTree {
    public TreeNode convert(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode[] res = convertCore(root);
        return res[0];
    }

    private TreeNode[] convertCore(TreeNode node) {
        TreeNode[] res = new TreeNode[2];
        if (node.left == null && node.right == null) {
            res[0] = node;
            res[1] = node;
        } else if (node.right == null) {
            res = convertCore(node.left);
            node.left = res[1];
            res[1].right = node;
            res[1] = node;
        } else if (node.left == null) {
            res = convertCore(node.right);
            node.right = res[0];
            res[0].left = node;
            res[0] = node;
        } else {
            TreeNode[] left = convertCore(node.left);
            TreeNode[] right = convertCore(node.right);
            left[1].right = node;
            node.left = left[1];
            right[0].left = node;
            node.right = right[0];
            res[0] = left[0];
            res[1] = right[1];
        }
        return res;
    }
}
