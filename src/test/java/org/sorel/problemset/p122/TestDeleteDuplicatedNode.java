package org.sorel.problemset.p122;

import org.junit.jupiter.api.Test;
import org.sorel.structure.ListNode;

public class TestDeleteDuplicatedNode {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
        test07();
        test08();
        test09();
        test10();
    }

    @Test
    public void test01() {
        DeleteDuplicatedNode sol = new DeleteDuplicatedNode();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        ListNode res = sol.deleteDuplicatedNode(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test02() {
        DeleteDuplicatedNode sol = new DeleteDuplicatedNode();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        ListNode res = sol.deleteDuplicatedNode(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test03() {
        DeleteDuplicatedNode sol = new DeleteDuplicatedNode();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(2);
        ListNode res = sol.deleteDuplicatedNode(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test04() {
        DeleteDuplicatedNode sol = new DeleteDuplicatedNode();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(1);
        ListNode res = sol.deleteDuplicatedNode(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test05() {
        DeleteDuplicatedNode sol = new DeleteDuplicatedNode();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next = new ListNode(4);
        ListNode res = sol.deleteDuplicatedNode(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test06() {
        DeleteDuplicatedNode sol = new DeleteDuplicatedNode();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next = new ListNode(5);
        ListNode res = sol.deleteDuplicatedNode(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test07() {
        DeleteDuplicatedNode sol = new DeleteDuplicatedNode();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode res = sol.deleteDuplicatedNode(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test08() {
        DeleteDuplicatedNode sol = new DeleteDuplicatedNode();
        ListNode head = new ListNode(1);
        ListNode res = sol.deleteDuplicatedNode(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test09() {
        DeleteDuplicatedNode sol = new DeleteDuplicatedNode();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        ListNode res = sol.deleteDuplicatedNode(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    @Test
    public void test10() {
        DeleteDuplicatedNode sol = new DeleteDuplicatedNode();
        ListNode head = null;
        ListNode res = sol.deleteDuplicatedNode(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }
}
