package org.sorel.problemset.p062;

import org.sorel.structure.TreeNode;

/*
 * 前序遍历：根节点 -> 左子节点 -> 右子节点
 * 中序遍历：左子节点 -> 根节点 -> 右子节点
 * 前序遍历：左子节点 -> 右子节点 -> 根节点
 */
public class ConstructBinaryTree {
    public TreeNode constructBinaryTree(int[] pre, int[] in) {
        if (pre == null || pre.length == 0 || in == null || in.length == 0 ||
                pre.length != in.length) {
            return null;
        }

        return constructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private TreeNode constructBinaryTree(int[] pre, int preL, int preR, int[] in, int inL, int inR) {
        if (preL > preR || inL > inR) {
            return null;
        }

        TreeNode root = new TreeNode(preL);
        for (int i = inL; i <= inR; i++) {
            /**
             * 前序遍历序列中，第一个数字总是树的根节点的值，但在中序遍历中，根节点的值在序列的中间，
             * 左子树节点的值位于根节点值的左边，右子树节点值位于根节点值的右边
             */
            if (in[i] == pre[preL]) {
                root.left = constructBinaryTree(pre, preL + 1, preL + i - inL, in, inL, i - 1);
                root.right = constructBinaryTree(pre, preL + i - inL + 1, preR, in, i + 1, inR);
                break;
            }
        }
        return root;
    }
}
