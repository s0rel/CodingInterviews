package org.sorel.problemset.p271;

import org.sorel.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeDepth {
    public int treeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode curr = null;
            for (int i = 0; i < size; i++) {
                curr = queue.poll();
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
