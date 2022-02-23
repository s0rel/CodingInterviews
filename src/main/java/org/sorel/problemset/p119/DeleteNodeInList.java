package org.sorel.problemset.p119;

import org.sorel.structure.ListNode;

public class DeleteNodeInList {
    public ListNode deleteNodeInList(ListNode head, ListNode node) {
        if (head == null || node == null) {
            return null;
        }

        if (node.next == null && node == head) { // 既是头节点，又是尾节点的情况
            head = null;
        } else if (node.next == null) { // 只是尾节点
            ListNode curr = head;
            while (curr.next != node) {
                curr = curr.next;
            }
            curr.next = null;
        } else { // 不是尾节点
            ListNode temp = node.next;
            node.val = temp.val;
            node.next = temp.next;
            temp = null;
        }
        return head;
    }
}
