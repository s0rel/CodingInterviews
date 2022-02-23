package org.sorel.problemset.p058;

import org.sorel.structure.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrintListInReversedOrder {
    public void printListInReversedOrder(ListNode head) {
        if (head == null) {
            return;
        }

        Deque<ListNode> stack = new ArrayDeque<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        for (ListNode node : stack) {
            System.out.print(node.val + " ");
        }
        System.out.println();
    }
}
