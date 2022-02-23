package org.sorel.problemset.p171;

import org.sorel.structure.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class PrintTreeFromTopToBottom {
    public void printTreeFromTopToBottom(TreeNode root) {
        if (root == null) {
            return;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        System.out.println();
    }
}
