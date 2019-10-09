package org.sorel.problemset.p62;

import org.sorel.structures.TreeNode;

/*
 * 前序遍历：根节点 -> 左子节点 -> 右子节点
 * 中序遍历：左子节点 -> 根节点 -> 右子节点
 * 前序遍历：左子节点 -> 右子节点 -> 根节点
 */
public class ConstructBinaryTree {
    public TreeNode constructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0 ||
                pre.length != in.length) {
            return null;
        }

        TreeNode root = constructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    private TreeNode constructBinaryTree(int[] pre, int preL, int preR, int[] in, int inL, int inR) {
        if (preL > preR || inL > inR) {
            return null;
        }

        TreeNode root = new TreeNode(preL);
        for (int i = inL; i <= inR; i++) {
            if (in[i] == pre[preL]) {
                root.left = constructBinaryTree(pre, preL + 1, preL + i - inL,
                        in, inL, i - 1);
                root.right = constructBinaryTree(pre, preL + i - inL + 1, preR,
                        in, i + 1, inR);
                break;
            }
        }
        return root;
    }
}
