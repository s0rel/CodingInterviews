package org.sorel.problemset.p145;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sorel.structures.ListNode;

public class TestMergeSortedLists {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
        test05();
    }

    @Test
    public void test01() {
        MergeSortedLists sol = new MergeSortedLists();
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);
        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);
        ListNode res = sol.merge(head1, head2);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test02() {
        MergeSortedLists sol = new MergeSortedLists();
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(5);
        ListNode res = sol.merge(head1, head2);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test03() {
        MergeSortedLists sol = new MergeSortedLists();
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode res = sol.merge(head1, head2);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test04() {
        MergeSortedLists sol = new MergeSortedLists();
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);
        ListNode head2 = null;
        ListNode res = sol.merge(head1, head2);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test05() {
        MergeSortedLists sol = new MergeSortedLists();
        ListNode h1 = null;
        ListNode h2 = null;
        ListNode res = sol.merge(h1, h2);
        Assertions.assertNull(res);
    }
}
