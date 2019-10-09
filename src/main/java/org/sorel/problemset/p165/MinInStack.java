package org.sorel.problemset.p165;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinInStack<T extends Comparable> {
    private Deque<T> stack;
    private T min;

    public MinInStack() {
        stack = new ArrayDeque<>();
    }

    public void push(T val) {
        if (stack.isEmpty()) {
            stack.push(val);
            min = val;
        } else {
            if (val.compareTo(min) >= 0) {
                stack.push(val);
            } else {
                stack.push(min);
                stack.push(val);
                min = val;
            }
        }
    }

    public T pop() {
        T res = stack.pop();
        if (res.compareTo(min) == 0) {
            min = stack.pop();
        }
        return res;
    }

    public T getMin() {
        return min;
    }
}
