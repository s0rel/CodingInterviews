package org.sorel.problemset.p191;

import org.sorel.structures.TreeNode;

public class ConvertBinarySearchTree {
    public TreeNode convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        TreeNode[] result = convertCore(pRootOfTree);
        return result[0];
    }

    public TreeNode[] convertCore(TreeNode node) {
        TreeNode[] result = new TreeNode[2];
        if (node.left == null && node.right == null) {
            result[0] = node;
            result[1] = node;
        } else if (node.right == null) {
            result = convertCore(node.left);
            node.left = result[1];
            result[1].right = node;
            result[1] = node;
        } else if (node.left == null) {
            result = convertCore(node.right);
            node.right = result[0];
            result[0].left = node;
            result[0] = node;
        } else {
            TreeNode[] resultLeft = convertCore(node.left);
            TreeNode[] resultRight = convertCore(node.right);
            resultLeft[1].right = node;
            node.left = resultLeft[1];
            resultRight[0].left = node;
            node.right = resultRight[0];
            result[0] = resultLeft[0];
            result[1] = resultRight[1];
        }
        return result;
    }
}
