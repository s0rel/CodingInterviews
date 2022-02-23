package org.sorel.problemset.p328;

import org.sorel.structure.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CommonParentInTree {
    public int commonParentInTreeIterate(TreeNode root, int o1, int o2) {
        // 哈希表记录遍历到的每个节点及其对应的父节点，队列记录访问到的每个节点
        Map<Integer, Integer> parent = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();

        // 根节点没有父节点，给它默认一个值
        parent.put(root.val, Integer.MIN_VALUE);
        queue.add(root);

        // 使用BFS遍历树，直到两个节点都找到为止
        while (!parent.containsKey(o1) || !parent.containsKey(o2)) {
            TreeNode node = queue.poll();
            if (node != null) {
                if (node.left != null) {
                    parent.put(node.left.val, node.val);
                    queue.add(node.left);
                }
                if (node.right != null) {
                    parent.put(node.right.val, node.val);
                    queue.add(node.right);
                }
            }
        }

        Set<Integer> ancestors = new HashSet<>();

        // 记录下o1和它的祖先节点，从o1节点开始一直到根节点。
        while (parent.containsKey(o1)) {
            ancestors.add(o1);
            o1 = parent.get(o1);
        }

        // 查看o1和它的祖先节点是否包含o2节点，如果不包含再看是否包含o2的父节点
        while (!ancestors.contains(o2)) {
            o2 = parent.get(o2);
        }
        return o2;
    }
}
