package org.sorel.problemset.p288;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MaxInSlidingWindow {
    public List<Integer> maxInWindows(int[] arr, int size) {
        List<Integer> res = new ArrayList<>();
        if (arr == null || arr.length == 0 || arr.length < size || size <= 0) {
            return res;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            while (queue.peekFirst() != null && i - queue.peekFirst() >= size) {
                queue.removeFirst();
            }

            while (queue.peekLast() != null && i - queue.peekLast() >= size) {
                queue.removeLast();
            }

            if (queue.isEmpty()) {
                queue.addFirst(i);
            } else {
                if (arr[i] > arr[queue.peekFirst()]) {
                    queue.clear();
                    queue.addFirst(i);
                } else {
                    while (arr[i] > arr[queue.peekLast()]) {
                        queue.removeLast();
                    }
                    queue.addLast(i);
                }
            }

            if (i >= size - 1) {
                res.add(arr[queue.peekFirst()]);
            }
        }
        return res;
    }
}
