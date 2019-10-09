package org.sorel.problemset.p145;

import org.sorel.structures.ListNode;

public class MergeSortedLists {
    public ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null && head2 == null) {
            return null;
        } else if (head1 == null && head2 != null) {
            return head2;
        } else if (head1 != null && head2 == null) {
            return head1;
        }

        ListNode head = null, curr1 = head1, curr2 = head2;
        while (curr1 != null && curr2 != null) {
            if (curr1.val <= curr2.val) {
                if (head == null) {
                    head = curr1;
                } else {
                    head.next = curr1;
                    head = head.next;
                }
                curr1 = curr1.next;
            } else {
                if (head == null) {
                    head = curr2;
                } else {
                    head.next = curr2;
                    head = head.next;
                }
                curr2 = curr2.next;
            }
        }

        head.next = (curr1 != null) ? curr1 : curr2;
        return (head1.val <= head2.val) ? head1 : head2;
    }
}
