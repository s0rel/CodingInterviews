package org.sorel.problemset.p122;

import org.sorel.structure.ListNode;

public class DeleteDuplicatedNode {
    public ListNode deleteDuplicatedNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        boolean flag = false;
        ListNode prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            flag = false;
            if (next != null && curr.val == next.val) {
                flag = true;
            }

            if (!flag) {
                prev = curr;
                curr = next;
            } else {
                int val = curr.val;

                // 只要重复节点不包含尾节点，就可以将重复节点全部删除
                while (next != null && curr.val == val) {
                    ListNode temp = next;
                    curr.val = next.val;
                    curr.next = next.next;
                    next = next.next;
                    temp = null;
                }

                // 处理重复节点为尾节点的情况
                if (curr.val == val) {
                    curr = null;
                }

                // 处理重复节点为头节点的情况
                if (prev == null) {
                    head = curr;
                } else {
                    prev.next = curr;
                }
            }
        }
        return head;
    }
}
