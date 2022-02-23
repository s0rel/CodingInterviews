package org.sorel.problemset.p134;

import org.sorel.structure.ListNode;

public class KthNodeFromEnd {
    public ListNode kthNodeFromEnd(ListNode head, int k) {
        if (k <= 0 || head == null) {
            return null;
        }

        ListNode fast = head, slow = head;
        while (fast != null) {
            if (k > 0) {
                fast = fast.next;
                k--;
            } else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return k > 0 ? null : slow;
    }
}
