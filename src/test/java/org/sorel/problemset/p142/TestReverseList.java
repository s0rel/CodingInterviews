package org.sorel.problemset.p142;

import org.junit.Assert;
import org.junit.Test;
import org.sorel.structures.ListNode;

public class TestReverseList {
    @Test
    public void test() {
        test01();
        test02();
        test03();
    }

    @Test
    public void test01() {
        ReverseList sol = new ReverseList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = sol.reverseList(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test02() {
        ReverseList sol = new ReverseList();
        ListNode head = new ListNode(1);
        ListNode res = sol.reverseList(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test03() {
        ReverseList sol = new ReverseList();
        ListNode head = null;
        Assert.assertNull(sol.reverseList(head));
    }
}
