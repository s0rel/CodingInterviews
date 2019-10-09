package org.sorel.problemset.p194;

import org.sorel.structures.TreeNode;

public class SerializeBinaryTrees {
    public String serialize(TreeNode root) {
        if (root == null) {
            return "$,";
        }
        return root.val + "," + serialize(root.left) + serialize(root.right);
    }

    public TreeNode deserialize(String str) {
        StringBuilder s = new StringBuilder(str);
        return deserialize(s);
    }

    private TreeNode deserialize(StringBuilder s) {
        if (s.length() == 0) {
            return null;
        }

        String num = s.substring(0, s.indexOf(","));
        s.delete(0, s.indexOf(","));
        s.deleteCharAt(0);
        if (num.equals("$")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(num));
        node.left = deserialize(s);
        node.right = deserialize(s);
        return node;
    }
}
