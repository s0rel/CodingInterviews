package org.sorel.problemset.p271;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sorel.structures.TreeNode;

public class TestTreeDepth {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
        test05();
    }

    @Test
    public void test01() {
        TreeDepth sol = new TreeDepth();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.right.left = new TreeNode(7);
        Assertions.assertEquals(4, sol.treeDepth(root));
    }

    @Test
    public void test02() {
        TreeDepth sol = new TreeDepth();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);
        Assertions.assertEquals(5, sol.treeDepth(root));
    }

    @Test
    public void test03() {
        TreeDepth sol = new TreeDepth();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        root.right.right.right.right = new TreeNode(5);
        Assertions.assertEquals(5, sol.treeDepth(root));
    }

    @Test
    public void test04() {
        TreeDepth sol = new TreeDepth();
        TreeNode root = new TreeNode(1);
        Assertions.assertEquals(1, sol.treeDepth(root));
    }

    @Test
    public void test05() {
        TreeDepth sol = new TreeDepth();
        TreeNode root = null;
        Assertions.assertEquals(0, sol.treeDepth(root));
    }
}
