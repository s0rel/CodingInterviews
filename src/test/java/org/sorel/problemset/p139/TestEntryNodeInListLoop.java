package org.sorel.problemset.p139;

import org.junit.Assert;
import org.junit.Test;
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
        Assert.assertNull(sol.meetingNode(head));
    }

    @Test
    public void test02() {
        EntryNodeInListLoop sol = new EntryNodeInListLoop();
        ListNode head = new ListNode(1);
        head.next = head;
        Assert.assertEquals(1, sol.meetingNode(head).val);
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
        Assert.assertEquals(3, sol.meetingNode(head).val);
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
        Assert.assertEquals(1, sol.meetingNode(head).val);
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
        Assert.assertEquals(5, sol.meetingNode(head).val);
    }

    @Test
    public void test06() {
        EntryNodeInListLoop sol = new EntryNodeInListLoop();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Assert.assertNull(sol.meetingNode(head));
    }

    @Test
    public void test07() {
        EntryNodeInListLoop sol = new EntryNodeInListLoop();
        ListNode head = null;
        Assert.assertNull(sol.meetingNode(head));
    }
}
