package org.sorel.problemset.p071;

import java.util.Deque;
import java.util.LinkedList;

public class StackWithTwoQueues<T> {
    private Deque<T> queue1;
    private Deque<T> queue2;

    public StackWithTwoQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(T e) {
        if (!queue2.isEmpty()) {
            queue2.offer(e);
        } else {
            queue1.offer(e);
        }
    }

    public T pop() {
        if (!queue2.isEmpty()) {
            int size = queue2.size();
            for (int i = 0; i < size; i++) {
                queue1.offer(queue2.poll());
            }
            return queue1.poll();
        } else if (!queue1.isEmpty()) {
            int size = queue1.size();
            for (int i = 0; i < size; i++) {
                queue2.offer(queue1.poll());
            }
            return queue2.poll();
        } else {
            return null;
        }
    }
}
