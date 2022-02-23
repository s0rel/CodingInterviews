package org.sorel.problemset.p148;

import org.sorel.structure.TreeNode;

public class SubstructureInTree {
    public boolean hasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }

        if (root1.val == root2.val) {
            if (doesTree1HaveTree2(root1, root2)) {
                return true;
            }
        }
        return hasSubtree(root1.left, root2) || hasSubtree(root1.right, root2);
    }

    private boolean doesTree1HaveTree2(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }

        if (root1.val != root2.val) {
            return false;
        }
        return doesTree1HaveTree2(root1.left, root2.left) && doesTree1HaveTree2(root1.right, root2.right);
    }
}
