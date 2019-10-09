package org.sorel.problemset.p253;

import org.sorel.structures.ListNode;

public class FirstCommonNodeInLists {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode node1 = pHead1, node2 = pHead2;
        int len1 = 0, len2 = 0;
        while (node1 != null) {
            node1 = node1.next;
            len1++;
        }
        while (node2 != null) {
            node2 = node2.next;
            len2++;
        }

        node1 = pHead1;
        node2 = pHead2;
        while (len1 > len2) {
            node1 = node1.next;
            len1--;
        }
        while (len2 > len1) {
            node2 = node2.next;
            len2--;
        }

        while (node1 != null) {
            if (node1 != node2) {
                node1 = node1.next;
                node2 = node2.next;
            } else {
                break;
            }
        }
        return node1;
    }
}
