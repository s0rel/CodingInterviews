package org.sorel.problemset.p273;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sorel.structure.TreeNode;

public class TestBalancedBinaryTree {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
        test07();
    }

    @Test
    public void test01() {
        BalancedBinaryTree sol = new BalancedBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Assertions.assertTrue(sol.isBalanced(root));
    }

    @Test
    public void test02() {
        BalancedBinaryTree sol = new BalancedBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.right.left = new TreeNode(7);
        Assertions.assertTrue(sol.isBalanced(root));
    }

    @Test
    public void test03() {
        BalancedBinaryTree sol = new BalancedBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        Assertions.assertFalse(sol.isBalanced(root));
    }

    @Test
    public void test04() {
        BalancedBinaryTree sol = new BalancedBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);
        Assertions.assertFalse(sol.isBalanced(root));
    }

    @Test
    public void test05() {
        BalancedBinaryTree sol = new BalancedBinaryTree();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        root.right.right.right.right = new TreeNode(5);
        Assertions.assertFalse(sol.isBalanced(root));
    }

    @Test
    public void test06() {
        BalancedBinaryTree sol = new BalancedBinaryTree();
        TreeNode root = new TreeNode(1);
        Assertions.assertTrue(sol.isBalanced(root));
    }

    @Test
    public void test07() {
        BalancedBinaryTree sol = new BalancedBinaryTree();
        TreeNode root = null;
        Assertions.assertTrue(sol.isBalanced(root));
    }
}
