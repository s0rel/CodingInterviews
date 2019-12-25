package org.sorel.problemset.p119;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sorel.structures.ListNode;

public class TestDeleteNodeInList {
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
        DeleteNodeInList sol = new DeleteNodeInList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = sol.deleteNodeInList(head, head);
        Assertions.assertEquals(2, res.val);
    }

    @Test
    public void test02() {
        DeleteNodeInList sol = new DeleteNodeInList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = sol.deleteNodeInList(head, head.next.next.next.next);
        Assertions.assertNull(head.next.next.next.next);
    }

    @Test
    public void test03() {
        DeleteNodeInList sol = new DeleteNodeInList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = sol.deleteNodeInList(head, head.next.next);
        Assertions.assertEquals(4, head.next.next.val);
    }

    @Test
    public void test04() {
        DeleteNodeInList sol = new DeleteNodeInList();
        ListNode head = new ListNode(1);
        ListNode res = sol.deleteNodeInList(head, head);
        Assertions.assertNull(res);
    }

    @Test
    public void test05() {
        DeleteNodeInList sol = new DeleteNodeInList();
        ListNode head = null;
        ListNode res = sol.deleteNodeInList(head, head);
        Assertions.assertNull(res);
    }
}