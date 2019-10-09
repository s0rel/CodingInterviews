package org.sorel.problemset.p065;

public class NextNodeInBinaryTrees {
    public TreeNode nextNodeInBinaryTrees(TreeNode node) {
        if (node == null) {
            return null;
        }

        // 如果一个节点有右子树，那么它的下一个节点就是它的右子树中的最左子节点
        if (node.right != null) {
            node = node.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }

        /*
         * 如果一个节点没有右子树，但它是它父节点的左子节点，那么它的下一个节点就是它的父节点
         * 如果一个节点没有右子树，但它是它父节点的右子节点，那么需要沿着父节点一直向上遍历，
         * 直到找到一个是它父节点的左子节点的节点，如果这样的节点存在，那么这个节点的父节点
         * 就是需要找的下一个节点
         */
        while (node.parent != null) {
            if (node.parent.left == node) {
                return node.parent;
            }
            node = node.parent;
        }
        return null;
    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode parent;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
