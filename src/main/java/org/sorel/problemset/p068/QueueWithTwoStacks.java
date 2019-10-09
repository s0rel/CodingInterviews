package org.sorel.problemset.p068;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueWithTwoStacks<T> {
    private Deque<T> stack1;
    private Deque<T> stack2;

    public QueueWithTwoStacks() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    public void offer(T e) {
        stack1.push(e);
    }

    public T poll() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
