package org.sorel.problemset.p182;

import org.sorel.structures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathInTree {
    public void findPath(TreeNode root, int exceptedSum) {
        if (root == null || root.val > exceptedSum) {
            return;
        }

        List<Integer> path = new ArrayList<>();
        findPath(root, path, exceptedSum, 0);
    }

    private void findPath(TreeNode node, List<Integer> path, int exceptedSum, int currentSum) {
        path.add(node.val);
        currentSum += node.val;
        if (node.left != null) {
            findPath(node.left, path, exceptedSum, currentSum);
        }
        if (node.right != null) {
            findPath(node.right, path, exceptedSum, currentSum);
        }
        if (node.left == null && node.right == null && currentSum == exceptedSum) {
            System.out.println(path);
        }
        path.remove(path.size() - 1);
    }
}
