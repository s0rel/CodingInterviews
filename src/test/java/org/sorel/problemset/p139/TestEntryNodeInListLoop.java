package org.sorel.problemset.p139;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sorel.structures.ListNode;

public class TestEntryNodeInListLoop {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
        test07();
    }

    @Test
    public void test01() {
        EntryNodeInListLoop sol = new EntryNodeInListLoop();
        ListNode head = new ListNode(1);
        Assertions.assertNull(sol.meetingNode(head));
    }

    @Test
    public void test02() {
        EntryNodeInListLoop sol = new EntryNodeInListLoop();
        ListNode head = new ListNode(1);
        head.next = head;
        Assertions.assertEquals(1, sol.meetingNode(head).val);
    }

    @Test
    public void test03() {
        EntryNodeInListLoop sol = new EntryNodeInListLoop();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next;
        Assertions.assertEquals(3, sol.meetingNode(head).val);
    }

    @Test
    public void test04() {
        EntryNodeInListLoop sol = new EntryNodeInListLoop();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head;
        Assertions.assertEquals(1, sol.meetingNode(head).val);
    }

    @Test
    public void test05() {
        EntryNodeInListLoop sol = new EntryNodeInListLoop();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next.next.next;
        Assertions.assertEquals(5, sol.meetingNode(head).val);
    }

    @Test
    public void test06() {
        EntryNodeInListLoop sol = new EntryNodeInListLoop();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Assertions.assertNull(sol.meetingNode(head));
    }

    @Test
    public void test07() {
        EntryNodeInListLoop sol = new EntryNodeInListLoop();
        ListNode head = null;
        Assertions.assertNull(sol.meetingNode(head));
    }
}
