package org.sorel.problemset.p139;

import org.sorel.structures.ListNode;

public class EntryNodeInListLoop {
    public ListNode meetingNode(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode fast = head, slow = head;
        while (true) {
            if (fast.next == null || fast.next.next == null) {
                return null;
            }

            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }

        slow = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
