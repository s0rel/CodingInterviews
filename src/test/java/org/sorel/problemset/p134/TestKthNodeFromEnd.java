package org.sorel.problemset.p134;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sorel.structure.ListNode;

public class TestKthNodeFromEnd {
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
        KthNodeFromEnd sol = new KthNodeFromEnd();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Assertions.assertEquals(4, sol.kthNodeFromEnd(head, 2).val);
    }

    @Test
    public void test02() {
        KthNodeFromEnd sol = new KthNodeFromEnd();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Assertions.assertEquals(5, sol.kthNodeFromEnd(head, 1).val);
    }

    @Test
    public void test03() {
        KthNodeFromEnd sol = new KthNodeFromEnd();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Assertions.assertEquals(1, sol.kthNodeFromEnd(head, 5).val);
    }

    @Test
    public void test04() {
        KthNodeFromEnd sol = new KthNodeFromEnd();
        ListNode head = null;
        Assertions.assertNull(sol.kthNodeFromEnd(head, 100));
    }

    @Test
    public void test05() {
        KthNodeFromEnd sol = new KthNodeFromEnd();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Assertions.assertNull(sol.kthNodeFromEnd(head, 6));
    }
}
