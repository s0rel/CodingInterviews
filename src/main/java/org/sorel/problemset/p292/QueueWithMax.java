package org.sorel.problemset.p292;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueWithMax<T extends Comparable> {
    private Deque<InternalData<T>> dataStack;
    private Deque<InternalData<T>> maxStack;
    private int currentIndex;

    public QueueWithMax() {
        this.dataStack = new ArrayDeque<>();
        this.maxStack = new ArrayDeque<>();
        this.currentIndex = 0;
    }

    public T max() {
        if (maxStack.isEmpty()) {
            return null;
        }
        return maxStack.getFirst().value;
    }

    public void pushBack(T value) {
        while (!maxStack.isEmpty() && value.compareTo(maxStack.getLast().value) >= 0)
            maxStack.removeLast();
        InternalData<T> addData = new InternalData<>(value, currentIndex);
        maxStack.addLast(addData);
        dataStack.addLast(addData);
        currentIndex++;
    }

    public T popFront() {
        if (dataStack.isEmpty()) {
            return null;
        }
        InternalData<T> delData = dataStack.removeFirst();
        if (delData.index == maxStack.getFirst().index)
            maxStack.removeFirst();
        return delData.value;
    }

    private static class InternalData<V extends Comparable> {
        public V value;
        public int index;

        public InternalData(V value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
