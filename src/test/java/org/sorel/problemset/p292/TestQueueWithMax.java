package org.sorel.problemset.p292;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQueueWithMax {
    @Test
    public void test() {
        QueueWithMax<Integer> queue = new QueueWithMax<>();
        queue.pushBack(2);
        Assertions.assertEquals(Integer.valueOf(2), queue.max());

        queue.pushBack(3);
        Assertions.assertEquals(Integer.valueOf(3), queue.max());

        queue.pushBack(4);
        Assertions.assertEquals(Integer.valueOf(4), queue.max());

        queue.pushBack(2);
        Assertions.assertEquals(Integer.valueOf(4), queue.max());

        queue.popFront();
        Assertions.assertEquals(Integer.valueOf(4), queue.max());

        queue.popFront();
        Assertions.assertEquals(Integer.valueOf(4), queue.max());

        queue.popFront();
        Assertions.assertEquals(Integer.valueOf(2), queue.max());

        queue.pushBack(6);
        Assertions.assertEquals(Integer.valueOf(6), queue.max());

        queue.pushBack(2);
        Assertions.assertEquals(Integer.valueOf(6), queue.max());

        queue.pushBack(5);
        Assertions.assertEquals(Integer.valueOf(6), queue.max());

        queue.popFront();
        Assertions.assertEquals(Integer.valueOf(6), queue.max());

        queue.popFront();
        Assertions.assertEquals(Integer.valueOf(5), queue.max());

        queue.popFront();
        Assertions.assertEquals(Integer.valueOf(5), queue.max());

        queue.pushBack(1);
        Assertions.assertEquals(Integer.valueOf(5), queue.max());
    }
}
