package org.sorel.problemset.p139;

import org.sorel.structures.ListNode;

/*
 * 定义两个指针，同时从链表的头节点出发，一个指针一次走一步，另一个指针一次走两步。
 * 如果走得快的指针追上了走得慢的指针，那么链表就包含环。
 */
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
