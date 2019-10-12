package org.sorel.problemset.p182;

import org.junit.Test;
import org.sorel.structures.TreeNode;

public class TestPathInTree {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
    }

    @Test
    public void test01() {
        PathInTree sol = new PathInTree();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        System.out.println(sol.findPath(root, 22));
    }

    @Test
    public void test02() {
        PathInTree sol = new PathInTree();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        System.out.println(sol.findPath(root, 15));
    }

    @Test
    public void test03() {
        PathInTree sol = new PathInTree();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(2);
        root.left.left.left.left = new TreeNode(1);
        System.out.println(sol.findPath(root, 15));
    }

    @Test
    public void test04() {
        PathInTree sol = new PathInTree();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        root.right.right.right.right = new TreeNode(5);
        System.out.println(sol.findPath(root, 16));
    }

    @Test
    public void test05() {
        PathInTree sol = new PathInTree();
        TreeNode root = new TreeNode(1);
        System.out.println(sol.findPath(root, 1));
    }

    @Test
    public void test06() {
        PathInTree sol = new PathInTree();
        TreeNode root = null;
        System.out.println(sol.findPath(root, 0));
    }
}
