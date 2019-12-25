package org.sorel.problemset.p058;

import org.junit.jupiter.api.Test;
import org.sorel.structures.ListNode;

public class TestPrintListInReversedOrder {
    @Test
    public void test() {
        test01();
        test02();
        test03();
    }

    @Test
    public void test01() {
        PrintListInReversedOrder sol = new PrintListInReversedOrder();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        sol.printListInReversedOrder(head);
    }

    @Test
    public void test02() {
        PrintListInReversedOrder sol = new PrintListInReversedOrder();
        ListNode head = new ListNode(1);
        sol.printListInReversedOrder(head);
    }

    @Test
    public void test03() {
        PrintListInReversedOrder sol = new PrintListInReversedOrder();
        ListNode head = null;
        sol.printListInReversedOrder(head);
    }
}