package org.sorel.problemset.p176;

import org.sorel.structure.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PrintTreesInZigzag {
    public void printTreesInZigzag(TreeNode root) {
        if (root == null) {
            return;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> list = new ArrayList<>();
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            if (level % 2 != 0) {
                Collections.reverse(list);
            }
            level++;

            for (int value : list) {
                System.out.print(value + " ");
            }
            System.out.println();
            list.clear();
        }
    }
}
