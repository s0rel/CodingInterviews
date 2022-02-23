package org.sorel.problemset.p182;

import org.sorel.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathInTree {
    public List<List<Integer>> findPath(TreeNode root, int exceptedSum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null || root.val > exceptedSum) {
            return res;
        }

        List<Integer> path = new ArrayList<>();
        findPath(root, path, res, exceptedSum, 0);
        return res;
    }

    private void findPath(TreeNode node, List<Integer> path, List<List<Integer>> res,
                          int exceptedSum, int currentSum) {
        path.add(node.val);
        currentSum += node.val;
        if (node.left != null) {
            findPath(node.left, path, res, exceptedSum, currentSum);
        }
        if (node.right != null) {
            findPath(node.right, path, res, exceptedSum, currentSum);
        }
        if (node.left == null && node.right == null && currentSum == exceptedSum) {
            res.add(new ArrayList<>(path)); // 这里必须新建一个 ArrayList
        }
        path.remove(path.size() - 1);
    }
}
