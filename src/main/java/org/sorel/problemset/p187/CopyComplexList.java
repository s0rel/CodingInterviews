package org.sorel.problemset.p187;

public class CopyComplexList {
    public ComplexListNode clone(ComplexListNode head) {
        if (head == null) {
            return null;
        }

        cloneNodes(head);
        connectRandomNodes(head);
        return reconnectNodes(head);
    }

    private ComplexListNode reconnectNodes(ComplexListNode head) {
        ComplexListNode newHead = head.next;
        ComplexListNode curr = head;
        ComplexListNode pCurr = newHead;
        while (true) {
            curr.next = curr.next.next;
            curr = curr.next;
            if (curr == null) {
                pCurr.next = null;
                break;
            }
            pCurr.next = pCurr.next.next;
            pCurr = pCurr.next;
        }
        return newHead;
    }

    private void connectRandomNodes(ComplexListNode head) {
        ComplexListNode curr = head;
        ComplexListNode pCurr = null;
        while (curr != null) {
            pCurr = curr.next;
            if (curr.random != null) {
                pCurr.random = curr.random.next;
            }
            curr = pCurr.next;
        }
    }

    private void cloneNodes(ComplexListNode head) {
        ComplexListNode curr = head;
        ComplexListNode pCurr = null;
        while (curr != null) {
            pCurr = new ComplexListNode(curr.val);
            pCurr.next = curr.next;
            curr.next = pCurr;
            curr = curr.next.next;
        }
    }

    public static class ComplexListNode {
        int val;
        ComplexListNode next;
        ComplexListNode random;

        public ComplexListNode(int val) {
            this.val = val;
        }
    }
}
