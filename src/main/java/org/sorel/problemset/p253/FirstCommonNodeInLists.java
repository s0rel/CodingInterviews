package org.sorel.problemset.p253;

import org.sorel.structure.ListNode;

/*
 * 首先遍历两个链表得到它们的长度，就能知道哪个链表比较长，以及长的链表比短的链表
 * 多几个节点。在第二次遍历的时候，在较长的链表上先走若干步，接着同时在两个链表上
 * 遍历，找到的第一个相同节点就是它们的第一个公共节点
 */
public class FirstCommonNodeInLists {
    public ListNode FindFirstCommonNode(ListNode head1, ListNode head2) {
        ListNode node1 = head1, node2 = head2;
        int len1 = 0, len2 = 0;
        while (node1 != null) {
            node1 = node1.next;
            len1++;
        }
        while (node2 != null) {
            node2 = node2.next;
            len2++;
        }

        node1 = head1;
        node2 = head2;
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
