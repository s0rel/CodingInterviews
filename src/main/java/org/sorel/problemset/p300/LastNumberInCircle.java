package org.sorel.problemset.p300;

import org.sorel.structures.ListNode;

public class LastNumberInCircle {
    public int lastRemaining(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }

        int res = 0;
        for (int i = 2; i <= n; i++) { // 这里要取 "="
            res = (res + m) % i;
        }
        return res;
    }

    public int lastRemaining_(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }

        ListNode head = new ListNode(0);
        ListNode curr = head;
        for (int i = 1; i < n; i++) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        curr.next = head;

        curr = head;
        while (true) {
            if (curr.next == curr) {
                return curr.val;
            }

            for (int i = 1; i < m; i++) {
                curr = curr.next;
            }
            curr.val = curr.next.val;
            curr.next = curr.next.next;
        }
    }
}
